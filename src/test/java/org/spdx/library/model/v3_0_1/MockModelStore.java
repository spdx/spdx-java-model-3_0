/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.spdx.core.IExternalElementInfo;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.TypedValue;
import org.spdx.storage.IModelStore;
import org.spdx.storage.PropertyDescriptor;

/**
 * @author Gary
 * 
 * Mock model store for testing
 *
 */
public class MockModelStore implements IModelStore {
	
	static final String ANON_PREFIX = "__";
	
	Map<String, TypedValue> objectUriToTypedValue = new HashMap<>();
	Map<String, Map<PropertyDescriptor, Object>> valueMap = new HashMap<>();
	Map<String, Map<String, IExternalElementInfo>> externalReferenceMap = new HashMap<>();
	
	int nextIdNum = 0;
	
	IModelStoreLock lockStore = new IModelStoreLock() {

		@Override
		public void unlock() {
			
		}
		
	};

	@Override
	public void close() throws Exception {

	}

	@Override
	public boolean exists(String objectUri) {
		return objectUriToTypedValue.containsKey(objectUri);
	}

	@Override
	public void create(TypedValue typedValue)
			throws InvalidSPDXAnalysisException {
		objectUriToTypedValue.put(typedValue.getObjectUri(), typedValue);
		valueMap.put(typedValue.getObjectUri(), new HashMap<>());
	}

	@Override
	public List<PropertyDescriptor> getPropertyValueDescriptors(
			String objectUri) throws InvalidSPDXAnalysisException {
		return new ArrayList<>(valueMap.get(objectUri).keySet());
	}

	@Override
	public void setValue(String objectUri,
			PropertyDescriptor propertyDescriptor, Object value)
			throws InvalidSPDXAnalysisException {
		valueMap.get(objectUri).put(propertyDescriptor, value);
	}

	@Override
	public Optional<Object> getValue(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		return Optional.ofNullable(valueMap.get(objectUri).get(propertyDescriptor));
	}

	@Override
	public String getNextId(IdType idType) throws InvalidSPDXAnalysisException {
		
		switch (idType) {
			//TODO: Move the compat constants into it's own constants file
			case Anonymous: return ANON_PREFIX+String.valueOf(nextIdNum++);
			case LicenseRef: return "LicenseRef-"+String.valueOf(nextIdNum++);
			case DocumentRef: return "SPDXRef-"+String.valueOf(nextIdNum++);
			case SpdxId: return "DocumenRef"+String.valueOf(nextIdNum++);
			case ListedLicense: throw new InvalidSPDXAnalysisException("Can not generate a license ID for a Listed License");
			default: throw new InvalidSPDXAnalysisException("Unknown ID type for next ID: "+idType.toString());
		}
	}

	@Override
	public void removeProperty(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		valueMap.get(objectUri).remove(propertyDescriptor);
	}

	@Override
	public Stream<TypedValue> getAllItems(String nameSpace, String typeFilter)
			throws InvalidSPDXAnalysisException {
		Iterator<TypedValue> valueIter = objectUriToTypedValue.values().iterator();
		List<TypedValue> allItems = new ArrayList<>();
		while (valueIter.hasNext()) {
			TypedValue item = valueIter.next();
			if ((Objects.isNull(typeFilter) || typeFilter.equals(item.getType())) && 
					(Objects.isNull(nameSpace) || item.getObjectUri().startsWith(nameSpace))) {
				allItems.add(item);
			}
		}
		return Collections.unmodifiableList(allItems).stream();
	}

	@Override
	public IModelStoreLock enterCriticalSection(boolean readLockRequested)
			throws InvalidSPDXAnalysisException {
		return lockStore;
	}

	@Override
	public void leaveCriticalSection(IModelStoreLock lock) {

	}

	@Override
	public boolean removeValueFromCollection(String objectUri,
			PropertyDescriptor propertyDescriptor, Object value)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		return collection.remove(value);
	}

	@Override
	public int collectionSize(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		return Objects.isNull(collection) ? 0 : collection.size();
	}

	@Override
	public boolean collectionContains(String objectUri,
			PropertyDescriptor propertyDescriptor, Object value)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		return Objects.isNull(collection) ? false : collection.contains(value);
	}

	@Override
	public void clearValueCollection(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		if (Objects.nonNull(collection)) {
			collection.clear();
		}
	}

	@Override
	public boolean addValueToCollection(String objectUri,
			PropertyDescriptor propertyDescriptor, Object value)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		if (Objects.isNull(collection)) {
			collection = new ArrayList<>();
			valueMap.get(objectUri).put(propertyDescriptor, collection);
		}
		return collection.add(value);
	}

	@Override
	public Iterator<Object> listValues(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		@SuppressWarnings("unchecked")
		Collection<Object> collection = (Collection<Object>)(valueMap.get(objectUri).get(propertyDescriptor));
		return Objects.isNull(collection) ? new ArrayList<Object>().iterator() : collection.iterator();
	}

	@Override
	public boolean isCollectionMembersAssignableTo(String objectUri,
			PropertyDescriptor propertyDescriptor, Class<?> clazz)
			throws InvalidSPDXAnalysisException {
		return true;
	}

	@Override
	public boolean isPropertyValueAssignableTo(String objectUri,
			PropertyDescriptor propertyDescriptor, Class<?> clazz,
			String specVersion) throws InvalidSPDXAnalysisException {
		return true;
	}

	@Override
	public boolean isCollectionProperty(String objectUri,
			PropertyDescriptor propertyDescriptor)
			throws InvalidSPDXAnalysisException {
		return valueMap.get(objectUri).get(propertyDescriptor) instanceof Collection;
	}

	@Override
	public IdType getIdType(String objectUri) {
		return objectUri.startsWith(ANON_PREFIX) ? IdType.Anonymous : IdType.SpdxId;
	}

	@Override
	public Optional<String> getCaseSensisitiveId(String nameSpace,
			String caseInsensisitiveId) {
		return Optional.empty();
	}

	@Override
	public Optional<TypedValue> getTypedValue(String objectUri)
			throws InvalidSPDXAnalysisException {
		return Optional.ofNullable(objectUriToTypedValue.get(objectUri));
	}

	@Override
	public void delete(String objectUri) throws InvalidSPDXAnalysisException {

	}
	
	@Override
	public boolean isAnon(String objectUri) {
		return objectUri.startsWith(ANON_PREFIX);
	}
}

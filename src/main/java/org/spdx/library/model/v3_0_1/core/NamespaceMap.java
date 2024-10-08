/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0_1.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * A mapping between prefixes and namespace partial URIs. 
 */
public  class NamespaceMap extends ModelObjectV3  {

	
	/**
	 * Create the NamespaceMap with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the NamespaceMap
	 */
	public NamespaceMap() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the NamespaceMap
	 * @throws InvalidSPDXAnalysisException when unable to create the NamespaceMap
	 */
	public NamespaceMap(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the NamespaceMap is to be stored
	 * @param objectUri URI or anonymous ID for the NamespaceMap
	 * @param copyManager Copy manager for the NamespaceMap - can be null if copying is not required
	 * @param create true if NamespaceMap is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the NamespaceMap
	 */
	public NamespaceMap(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the NamespaceMap from the builder - used in the builder class
	 * @param builder Builder to create the NamespaceMap from
	 * @throws InvalidSPDXAnalysisException when unable to create the NamespaceMap
	 */
	protected NamespaceMap(NamespaceMapBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		if (Objects.nonNull(builder.prefix)) {
			setPrefix(builder.prefix);
		}
		if (Objects.nonNull(builder.namespace)) {
			setNamespace(builder.namespace);
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.NamespaceMap";
	}
	
	// Getters and Setters
	
	/**
	 * @return the prefix
	 */
	public @Nullable String getPrefix() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_PREFIX);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param prefix the prefix to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public NamespaceMap setPrefix(@Nullable String prefix) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(prefix)) {
			throw new InvalidSPDXAnalysisException("prefix is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_PREFIX, prefix);
		return this;
	}
	/**
	 * @return the namespace
	 */
	public @Nullable String getNamespace() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_NAMESPACE);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param namespace the namespace to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public NamespaceMap setNamespace(@Nullable String namespace) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(namespace)) {
			throw new InvalidSPDXAnalysisException("namespace is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_NAMESPACE, namespace);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "NamespaceMap: "+getObjectUri();
		
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		try {
			String prefix = getPrefix();
			if (Objects.isNull(prefix) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing prefix in NamespaceMap");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting prefix for NamespaceMap: "+e.getMessage());
		}
		try {
			String namespace = getNamespace();
			if (Objects.isNull(namespace) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing namespace in NamespaceMap");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting namespace for NamespaceMap: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class NamespaceMapBuilder extends ModelObjectV3Builder {
	
		/**
		 * Create an NamespaceMapBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public NamespaceMapBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an NamespaceMapBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public NamespaceMapBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
			setIdPrefix(from.getIdPrefix());
		}
		
		/**
		 * Creates a NamespaceMapBuilder
		 * @param modelStore model store for the built NamespaceMap
		 * @param objectUri objectUri for the built NamespaceMap
		 * @param copyManager optional copyManager for the built NamespaceMap
		 */
		public NamespaceMapBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected String prefix = null;
		protected String namespace = null;
		
		
		/**
		 * Sets the initial value of prefix
		 * @parameter prefix value to set
		 * @return this for chaining
		**/
		public NamespaceMapBuilder setPrefix(String prefix) {
			this.prefix = prefix;
			return this;
		}
		
		/**
		 * Sets the initial value of namespace
		 * @parameter namespace value to set
		 * @return this for chaining
		**/
		public NamespaceMapBuilder setNamespace(String namespace) {
			this.namespace = namespace;
			return this;
		}
	
		/**
		 * @return the NamespaceMap
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public NamespaceMap build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new NamespaceMap(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}

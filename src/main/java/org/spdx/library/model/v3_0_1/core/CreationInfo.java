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
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Provides information about the creation of the Element. 
 */
public  class CreationInfo extends ModelObjectV3  {

	Collection<Agent> createdBys = Collections.emptyList();
	Collection<Tool> createdUsings = Collections.emptyList();
	
	/**
	 * Create the CreationInfo with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the CreationInfo
	 */
	public CreationInfo() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the CreationInfo
	 * @throws InvalidSPDXAnalysisException when unable to create the CreationInfo
	 */
	public CreationInfo(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the CreationInfo is to be stored
	 * @param objectUri URI or anonymous ID for the CreationInfo
	 * @param copyManager Copy manager for the CreationInfo - can be null if copying is not required
	 * @param create true if CreationInfo is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the CreationInfo
	 */
	 @SuppressWarnings("unchecked")
	public CreationInfo(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
		if (!isExternal()) {
			createdBys = (Collection<Agent>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CREATED_BY, Agent.class);
		}
		if (!isExternal()) {
			createdUsings = (Collection<Tool>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CREATED_USING, Tool.class);
		}
	}

	/**
	 * Create the CreationInfo from the builder - used in the builder class
	 * @param builder Builder to create the CreationInfo from
	 * @throws InvalidSPDXAnalysisException when unable to create the CreationInfo
	 */
	 @SuppressWarnings("unchecked")
	protected CreationInfo(CreationInfoBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		createdBys = (Collection<Agent>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CREATED_BY, Agent.class);
		createdUsings = (Collection<Tool>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CREATED_USING, Tool.class);
		getCreatedBys().addAll(builder.createdBys);
		getCreatedUsings().addAll(builder.createdUsings);
		if (Objects.nonNull(builder.created)) {
			setCreated(builder.created);
		}
		if (Objects.nonNull(builder.specVersion)) {
			setSpecVersion(builder.specVersion);
		}
		setComment(builder.comment);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.CreationInfo";
	}
	
	// Getters and Setters
	public Collection<Agent> getCreatedBys() {
		return createdBys;
	}
	public Collection<Tool> getCreatedUsings() {
		return createdUsings;
	}
	
	/**
	 * @return the created
	 */
	public @Nullable String getCreated() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_CREATED);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param created the created to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CreationInfo setCreated(@Nullable String created) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(created)) {
			throw new InvalidSPDXAnalysisException("created is a required property");
		}
		if (isStrict() && Objects.nonNull(created) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", created)) {
			throw new InvalidSPDXAnalysisException("created value '" + created + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_CREATED, created);
		return this;
	}
	/**
	 * @return the specVersion
	 */
	public @Nullable String getSpecVersion() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_SPEC_VERSION);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param specVersion the specVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CreationInfo setSpecVersion(@Nullable String specVersion) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(specVersion)) {
			throw new InvalidSPDXAnalysisException("specVersion is a required property");
		}
		if (isStrict() && Objects.nonNull(specVersion) && !Pattern.matches("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$", specVersion)) {
			throw new InvalidSPDXAnalysisException("specVersion value '" + specVersion + 
				"' does not match the pattern '^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_SPEC_VERSION, specVersion);
		return this;
	}
		/**
	 * @return the comment
	 */
	public Optional<String> getComment() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_COMMENT);
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CreationInfo setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_COMMENT, comment);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "CreationInfo: "+getObjectUri();
		
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		try {
			String created = getCreated();
			if (Objects.isNull(created) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing created in CreationInfo");
			}
			if (Objects.nonNull(created) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", created)) {
				retval.add("created value '" + created + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting created for CreationInfo: "+e.getMessage());
		}
		try {
			String specVersion = getSpecVersion();
			if (Objects.isNull(specVersion) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing specVersion in CreationInfo");
			}
			if (Objects.nonNull(specVersion) && !Pattern.matches("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$", specVersion)) {
				retval.add("specVersion value '" + specVersion + 
					"' does not match the pattern '^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting specVersion for CreationInfo: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> comment = getComment();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting comment for CreationInfo: "+e.getMessage());
		}
		for (Agent createdBy:createdBys) {
			retval.addAll(createdBy.verify(verifiedIds, specVersionForVerify, profiles));
		}
		for (Tool createdUsing:createdUsings) {
			retval.addAll(createdUsing.verify(verifiedIds, specVersionForVerify, profiles));
		}
		return retval;
	}
	
	
	
	public static class CreationInfoBuilder extends ModelObjectV3Builder {
	
		/**
		 * Create an CreationInfoBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public CreationInfoBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an CreationInfoBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public CreationInfoBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
			setIdPrefix(from.getIdPrefix());
		}
		
		/**
		 * Creates a CreationInfoBuilder
		 * @param modelStore model store for the built CreationInfo
		 * @param objectUri objectUri for the built CreationInfo
		 * @param copyManager optional copyManager for the built CreationInfo
		 */
		public CreationInfoBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Collection<Agent> createdBys = new ArrayList<>();
		protected Collection<Tool> createdUsings = new ArrayList<>();
		protected String created = null;
		protected String specVersion = null;
		protected String comment = null;
		
		
		/**
		 * Adds a createdBy to the initial collection
		 * @parameter createdBy createdBy to add
		 * @return this for chaining
		**/
		public CreationInfoBuilder addCreatedBy(Agent createdBy) {
			if (Objects.nonNull(createdBy)) {
				createdBys.add(createdBy);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial createdBy collection
		 * @parameter createdByCollection collection to initialize the createdBy
		 * @return this for chaining
		**/
		public CreationInfoBuilder addAllCreatedBy(Collection<Agent> createdByCollection) {
			if (Objects.nonNull(createdByCollection)) {
				createdBys.addAll(createdByCollection);
			}
			return this;
		}
		
		/**
		 * Adds a createdUsing to the initial collection
		 * @parameter createdUsing createdUsing to add
		 * @return this for chaining
		**/
		public CreationInfoBuilder addCreatedUsing(Tool createdUsing) {
			if (Objects.nonNull(createdUsing)) {
				createdUsings.add(createdUsing);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial createdUsing collection
		 * @parameter createdUsingCollection collection to initialize the createdUsing
		 * @return this for chaining
		**/
		public CreationInfoBuilder addAllCreatedUsing(Collection<Tool> createdUsingCollection) {
			if (Objects.nonNull(createdUsingCollection)) {
				createdUsings.addAll(createdUsingCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of created
		 * @parameter created value to set
		 * @return this for chaining
		**/
		public CreationInfoBuilder setCreated(String created) {
			this.created = created;
			return this;
		}
		
		/**
		 * Sets the initial value of specVersion
		 * @parameter specVersion value to set
		 * @return this for chaining
		**/
		public CreationInfoBuilder setSpecVersion(String specVersion) {
			this.specVersion = specVersion;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public CreationInfoBuilder setComment(String comment) {
			this.comment = comment;
			return this;
		}
	
		/**
		 * @return the CreationInfo
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public CreationInfo build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new CreationInfo(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}

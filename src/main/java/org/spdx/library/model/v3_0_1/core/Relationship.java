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
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Describes a relationship between one or more elements. 
 */
public  class Relationship extends Element  {

	Collection<Element> tos = Collections.emptyList();
	
	/**
	 * Create the Relationship with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the Relationship
	 */
	public Relationship() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the Relationship
	 * @throws InvalidSPDXAnalysisException when unable to create the Relationship
	 */
	public Relationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the Relationship is to be stored
	 * @param objectUri URI or anonymous ID for the Relationship
	 * @param copyManager Copy manager for the Relationship - can be null if copying is not required
	 * @param create true if Relationship is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the Relationship
	 */
	 @SuppressWarnings("unchecked")
	public Relationship(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
		if (!isExternal()) {
			tos = (Collection<Element>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_TO, Element.class);
		}
	}

	/**
	 * Create the Relationship from the builder - used in the builder class
	 * @param builder Builder to create the Relationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the Relationship
	 */
	 @SuppressWarnings("unchecked")
	protected Relationship(RelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		tos = (Collection<Element>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_TO, Element.class);
		getTos().addAll(builder.tos);
		if (Objects.nonNull(builder.from)) {
			setFrom(builder.from);
		}
		setCompleteness(builder.completeness);
		if (Objects.nonNull(builder.relationshipType)) {
			setRelationshipType(builder.relationshipType);
		}
		setEndTime(builder.endTime);
		setStartTime(builder.startTime);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.Relationship";
	}
	
	// Getters and Setters
	public Collection<Element> getTos() {
		return tos;
	}
	
	/**
	 * @return the from
	 */
	 @SuppressWarnings("unchecked")
	public @Nullable Element getFrom() throws InvalidSPDXAnalysisException {
		Optional<Object> retval = getObjectPropertyValue(SpdxConstantsV3.PROP_FROM);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof Element)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for from");
			}
			return (Element)(retval.get());
		} else {
			return null;
		}
	}
		
	/**
	 * @param from the from to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Relationship setFrom(@Nullable Element from) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(from)) {
			throw new InvalidSPDXAnalysisException("from is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_FROM, from);
		return this;
	}
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public Relationship setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @return the completeness
	 */
	 @SuppressWarnings("unchecked")
	public Optional<RelationshipCompleteness> getCompleteness() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_COMPLETENESS);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof RelationshipCompleteness)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for completeness");
			}
			return (Optional<RelationshipCompleteness>)(Optional<?>)(retval);
		} else {
			return Optional.empty();
		}
	}
	/**
	 * @param completeness the completeness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Relationship setCompleteness(@Nullable RelationshipCompleteness completeness) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_COMPLETENESS, completeness);
		return this;
	}
	/**
	 * @return the relationshipType
	 */
	public @Nullable RelationshipType getRelationshipType() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_RELATIONSHIP_TYPE);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof RelationshipType)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for relationshipType");
			}
			return (RelationshipType)(retval.get());
		} else {
			return null;
		}
	}
	/**
	 * @param relationshipType the relationshipType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Relationship setRelationshipType(@Nullable RelationshipType relationshipType) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(relationshipType)) {
			throw new InvalidSPDXAnalysisException("relationshipType is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_RELATIONSHIP_TYPE, relationshipType);
		return this;
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public Relationship setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public Relationship setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
		/**
	 * @return the endTime
	 */
	public Optional<String> getEndTime() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_END_TIME);
	}
	/**
	 * @param endTime the endTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Relationship setEndTime(@Nullable String endTime) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.nonNull(endTime) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", endTime)) {
			throw new InvalidSPDXAnalysisException("endTime value '" + endTime + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_END_TIME, endTime);
		return this;
	}
		/**
	 * @return the startTime
	 */
	public Optional<String> getStartTime() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_START_TIME);
	}
	/**
	 * @param startTime the startTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Relationship setStartTime(@Nullable String startTime) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.nonNull(startTime) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", startTime)) {
			throw new InvalidSPDXAnalysisException("startTime value '" + startTime + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_START_TIME, startTime);
		return this;
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public Relationship setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public Relationship setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
	
	
	@Override
	public String toString() {
				return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		retval.addAll(super._verify(verifiedIds, specVersionForVerify, profiles));
		Element from;
		try {
			from = getFrom();
			if (Objects.nonNull(from)) {
				retval.addAll(from.verify(verifiedIds, specVersionForVerify, profiles));
			} else if (!Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
					retval.add("Missing from in Relationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting from for Relationship: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<RelationshipCompleteness> completeness = getCompleteness();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting completeness for Relationship: "+e.getMessage());
		}
		try {
			RelationshipType relationshipType = getRelationshipType();
			if (Objects.isNull(relationshipType) && 
						Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing relationshipType in Relationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting relationshipType for Relationship: "+e.getMessage());
		}
		try {
			Optional<String> endTime = getEndTime();
			if (endTime.isPresent() && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", endTime.get())) {
				retval.add("endTime value '" + endTime.get() + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting endTime for Relationship: "+e.getMessage());
		}
		try {
			Optional<String> startTime = getStartTime();
			if (startTime.isPresent() && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", startTime.get())) {
				retval.add("startTime value '" + startTime.get() + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting startTime for Relationship: "+e.getMessage());
		}
		for (Element to:tos) {
			retval.addAll(to.verify(verifiedIds, specVersionForVerify, profiles));
		}
		return retval;
	}
	
	
	
	public static class RelationshipBuilder extends ElementBuilder {
	
		/**
		 * Create an RelationshipBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public RelationshipBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an RelationshipBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public RelationshipBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
			setIdPrefix(from.getIdPrefix());
			if (from instanceof Element) {
				setCreationInfo(((Element)from).getCreationInfo());
			} else if (from instanceof CreationInfo) {
				setCreationInfo((CreationInfo)from);
			}
		}
		
		/**
		 * Creates a RelationshipBuilder
		 * @param modelStore model store for the built Relationship
		 * @param objectUri objectUri for the built Relationship
		 * @param copyManager optional copyManager for the built Relationship
		 */
		public RelationshipBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Collection<Element> tos = new ArrayList<>();
		protected Element from = null;
		protected RelationshipCompleteness completeness = null;
		protected RelationshipType relationshipType = null;
		protected String endTime = null;
		protected String startTime = null;
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public RelationshipBuilder addExtension(Extension extension) {
			if (Objects.nonNull(extension)) {
				super.extensions.add(extension);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial extension collection
		 * @parameter extensionCollection collection to initialize the extension
		 * @return this for chaining
		**/
		public RelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
			if (Objects.nonNull(extensionCollection)) {
				super.extensions.addAll(extensionCollection);
			}
			return this;
		}
		
		/**
		 * Adds a verifiedUsing to the initial collection
		 * @parameter verifiedUsing verifiedUsing to add
		 * @return this for chaining
		**/
		public RelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
			if (Objects.nonNull(verifiedUsing)) {
				super.verifiedUsings.add(verifiedUsing);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial verifiedUsing collection
		 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
		 * @return this for chaining
		**/
		public RelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
			if (Objects.nonNull(verifiedUsingCollection)) {
				super.verifiedUsings.addAll(verifiedUsingCollection);
			}
			return this;
		}
		
		/**
		 * Adds a to to the initial collection
		 * @parameter to to to add
		 * @return this for chaining
		**/
		public RelationshipBuilder addTo(Element to) {
			if (Objects.nonNull(to)) {
				tos.add(to);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial to collection
		 * @parameter toCollection collection to initialize the to
		 * @return this for chaining
		**/
		public RelationshipBuilder addAllTo(Collection<Element> toCollection) {
			if (Objects.nonNull(toCollection)) {
				tos.addAll(toCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public RelationshipBuilder addExternalRef(ExternalRef externalRef) {
			if (Objects.nonNull(externalRef)) {
				super.externalRefs.add(externalRef);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial externalRef collection
		 * @parameter externalRefCollection collection to initialize the externalRef
		 * @return this for chaining
		**/
		public RelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
			if (Objects.nonNull(externalRefCollection)) {
				super.externalRefs.addAll(externalRefCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalIdentifier to the initial collection
		 * @parameter externalIdentifier externalIdentifier to add
		 * @return this for chaining
		**/
		public RelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
			if (Objects.nonNull(externalIdentifier)) {
				super.externalIdentifiers.add(externalIdentifier);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial externalIdentifier collection
		 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
		 * @return this for chaining
		**/
		public RelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				super.externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of from
		 * @parameter from value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setFrom(Element from) {
			this.from = from;
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of completeness
		 * @parameter completeness value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
			this.completeness = completeness;
			return this;
		}
		
		/**
		 * Sets the initial value of relationshipType
		 * @parameter relationshipType value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
			this.relationshipType = relationshipType;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of endTime
		 * @parameter endTime value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setEndTime(String endTime) {
			this.endTime = endTime;
			return this;
		}
		
		/**
		 * Sets the initial value of startTime
		 * @parameter startTime value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setStartTime(String startTime) {
			this.startTime = startTime;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public RelationshipBuilder setName(String name) {
			super.name = name;
			return this;
		}
	
		/**
		 * @return the Relationship
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public Relationship build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new Relationship(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}
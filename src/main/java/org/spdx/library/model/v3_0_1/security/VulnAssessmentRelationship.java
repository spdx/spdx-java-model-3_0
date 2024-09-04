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
 
package org.spdx.library.model.v3_0_1.security;

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
import org.spdx.library.model.v3_0_1.core.Agent;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.Relationship;
import org.spdx.library.model.v3_0_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0_1.core.RelationshipType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Abstract ancestor class for all vulnerability assessments 
 */
public abstract class VulnAssessmentRelationship extends Relationship  {

	
	/**
	 * Create the VulnAssessmentRelationship with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the VulnAssessmentRelationship
	 */
	public VulnAssessmentRelationship() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the VulnAssessmentRelationship
	 * @throws InvalidSPDXAnalysisException when unable to create the VulnAssessmentRelationship
	 */
	public VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the VulnAssessmentRelationship is to be stored
	 * @param objectUri URI or anonymous ID for the VulnAssessmentRelationship
	 * @param copyManager Copy manager for the VulnAssessmentRelationship - can be null if copying is not required
	 * @param create true if VulnAssessmentRelationship is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the VulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	public VulnAssessmentRelationship(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the VulnAssessmentRelationship from the builder - used in the builder class
	 * @param builder Builder to create the VulnAssessmentRelationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the VulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	protected VulnAssessmentRelationship(VulnAssessmentRelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		setAssessedElement(builder.assessedElement);
		setSuppliedBy(builder.suppliedBy);
		setPublishedTime(builder.publishedTime);
		setWithdrawnTime(builder.withdrawnTime);
		setModifiedTime(builder.modifiedTime);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Security.VulnAssessmentRelationship";
	}
	
	// Getters and Setters
	
	/**
	 * @param from the from to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setFrom(@Nullable Element from) throws InvalidSPDXAnalysisException {
		super.setFrom(from);
		return this;
	}	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
		/**
	 * @return the assessedElement
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Element> getAssessedElement() throws InvalidSPDXAnalysisException {
		Optional<Object> retval = getObjectPropertyValue(SpdxConstantsV3.PROP_ASSESSED_ELEMENT);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof Element)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for assessedElement");
			}
			return (Optional<Element>)(Optional<?>)(retval);
		} else {
			return Optional.empty();
		}
	}
	
	/**
	 * @param assessedElement the assessedElement to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VulnAssessmentRelationship setAssessedElement(@Nullable Element assessedElement) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_ASSESSED_ELEMENT, assessedElement);
		return this;
	}
		/**
	 * @return the suppliedBy
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Agent> getSuppliedBy() throws InvalidSPDXAnalysisException {
		Optional<Object> retval = getObjectPropertyValue(SpdxConstantsV3.PROP_SUPPLIED_BY);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof Agent)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for suppliedBy");
			}
			return (Optional<Agent>)(Optional<?>)(retval);
		} else {
			return Optional.empty();
		}
	}
	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VulnAssessmentRelationship setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_SUPPLIED_BY, suppliedBy);
		return this;
	}
	/**
	 * @param completeness the completeness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setCompleteness(@Nullable RelationshipCompleteness completeness) throws InvalidSPDXAnalysisException {
		super.setCompleteness(completeness);
		return this;
	}	
	/**
	 * @param relationshipType the relationshipType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setRelationshipType(@Nullable RelationshipType relationshipType) throws InvalidSPDXAnalysisException {
		super.setRelationshipType(relationshipType);
		return this;
	}	
		/**
	 * @return the publishedTime
	 */
	public Optional<String> getPublishedTime() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_PUBLISHED_TIME);
	}
	/**
	 * @param publishedTime the publishedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VulnAssessmentRelationship setPublishedTime(@Nullable String publishedTime) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.nonNull(publishedTime) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", publishedTime)) {
			throw new InvalidSPDXAnalysisException("publishedTime value '" + publishedTime + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_PUBLISHED_TIME, publishedTime);
		return this;
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param endTime the endTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setEndTime(@Nullable String endTime) throws InvalidSPDXAnalysisException {
		super.setEndTime(endTime);
		return this;
	}	
	/**
	 * @param startTime the startTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setStartTime(@Nullable String startTime) throws InvalidSPDXAnalysisException {
		super.setStartTime(startTime);
		return this;
	}	
		/**
	 * @return the withdrawnTime
	 */
	public Optional<String> getWithdrawnTime() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_WITHDRAWN_TIME);
	}
	/**
	 * @param withdrawnTime the withdrawnTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VulnAssessmentRelationship setWithdrawnTime(@Nullable String withdrawnTime) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.nonNull(withdrawnTime) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", withdrawnTime)) {
			throw new InvalidSPDXAnalysisException("withdrawnTime value '" + withdrawnTime + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_WITHDRAWN_TIME, withdrawnTime);
		return this;
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public VulnAssessmentRelationship setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
		/**
	 * @return the modifiedTime
	 */
	public Optional<String> getModifiedTime() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_MODIFIED_TIME);
	}
	/**
	 * @param modifiedTime the modifiedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VulnAssessmentRelationship setModifiedTime(@Nullable String modifiedTime) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.nonNull(modifiedTime) && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", modifiedTime)) {
			throw new InvalidSPDXAnalysisException("modifiedTime value '" + modifiedTime + 
				"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
		}
		setPropertyValue(SpdxConstantsV3.PROP_MODIFIED_TIME, modifiedTime);
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
		Optional<Element> assessedElement;
		try {
			assessedElement = getAssessedElement();
			if (assessedElement.isPresent()) {
				retval.addAll(assessedElement.get().verify(verifiedIds, specVersionForVerify, profiles));
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting assessedElement for VulnAssessmentRelationship: "+e.getMessage());
		}
		Optional<Agent> suppliedBy;
		try {
			suppliedBy = getSuppliedBy();
			if (suppliedBy.isPresent()) {
				retval.addAll(suppliedBy.get().verify(verifiedIds, specVersionForVerify, profiles));
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting suppliedBy for VulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			Optional<String> publishedTime = getPublishedTime();
			if (publishedTime.isPresent() && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", publishedTime.get())) {
				retval.add("publishedTime value '" + publishedTime.get() + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting publishedTime for VulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			Optional<String> withdrawnTime = getWithdrawnTime();
			if (withdrawnTime.isPresent() && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", withdrawnTime.get())) {
				retval.add("withdrawnTime value '" + withdrawnTime.get() + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting withdrawnTime for VulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			Optional<String> modifiedTime = getModifiedTime();
			if (modifiedTime.isPresent() && !Pattern.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$", modifiedTime.get())) {
				retval.add("modifiedTime value '" + modifiedTime.get() + 
					"' does not match the pattern '^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$'");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting modifiedTime for VulnAssessmentRelationship: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static abstract class VulnAssessmentRelationshipBuilder extends RelationshipBuilder {
	
		/**
		 * Create an VulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public VulnAssessmentRelationshipBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an VulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public VulnAssessmentRelationshipBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a VulnAssessmentRelationshipBuilder
		 * @param modelStore model store for the built VulnAssessmentRelationship
		 * @param objectUri objectUri for the built VulnAssessmentRelationship
		 * @param copyManager optional copyManager for the built VulnAssessmentRelationship
		 */
		public VulnAssessmentRelationshipBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Element assessedElement = null;
		protected Agent suppliedBy = null;
		protected String publishedTime = null;
		protected String withdrawnTime = null;
		protected String modifiedTime = null;
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder addExtension(Extension extension) {
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
		public VulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public VulnAssessmentRelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public VulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
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
		public VulnAssessmentRelationshipBuilder addTo(Element to) {
			if (Objects.nonNull(to)) {
				super.tos.add(to);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial to collection
		 * @parameter toCollection collection to initialize the to
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
			if (Objects.nonNull(toCollection)) {
				super.tos.addAll(toCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder addExternalRef(ExternalRef externalRef) {
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
		public VulnAssessmentRelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public VulnAssessmentRelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public VulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
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
		public VulnAssessmentRelationshipBuilder setFrom(Element from) {
			super.from = from;
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of assessedElement
		 * @parameter assessedElement value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setAssessedElement(Element assessedElement) {
			this.assessedElement = assessedElement;
			return this;
		}
		
		/**
		 * Sets the initial value of suppliedBy
		 * @parameter suppliedBy value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
			this.suppliedBy = suppliedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of completeness
		 * @parameter completeness value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
			super.completeness = completeness;
			return this;
		}
		
		/**
		 * Sets the initial value of relationshipType
		 * @parameter relationshipType value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
			super.relationshipType = relationshipType;
			return this;
		}
		
		/**
		 * Sets the initial value of publishedTime
		 * @parameter publishedTime value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
			this.publishedTime = publishedTime;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of endTime
		 * @parameter endTime value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setEndTime(String endTime) {
			super.endTime = endTime;
			return this;
		}
		
		/**
		 * Sets the initial value of startTime
		 * @parameter startTime value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setStartTime(String startTime) {
			super.startTime = startTime;
			return this;
		}
		
		/**
		 * Sets the initial value of withdrawnTime
		 * @parameter withdrawnTime value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
			this.withdrawnTime = withdrawnTime;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of modifiedTime
		 * @parameter modifiedTime value to set
		 * @return this for chaining
		**/
		public VulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
			return this;
		}
	
		/**
		 * @return the VulnAssessmentRelationship
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public abstract VulnAssessmentRelationship build() throws InvalidSPDXAnalysisException;
	}
}

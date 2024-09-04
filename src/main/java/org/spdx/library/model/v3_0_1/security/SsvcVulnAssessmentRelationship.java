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
import org.spdx.library.model.v3_0_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0_1.core.RelationshipType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Provides an SSVC assessment for a vulnerability. 
 */
public  class SsvcVulnAssessmentRelationship extends VulnAssessmentRelationship  {

	
	/**
	 * Create the SsvcVulnAssessmentRelationship with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the SsvcVulnAssessmentRelationship
	 */
	public SsvcVulnAssessmentRelationship() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the SsvcVulnAssessmentRelationship
	 * @throws InvalidSPDXAnalysisException when unable to create the SsvcVulnAssessmentRelationship
	 */
	public SsvcVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the SsvcVulnAssessmentRelationship is to be stored
	 * @param objectUri URI or anonymous ID for the SsvcVulnAssessmentRelationship
	 * @param copyManager Copy manager for the SsvcVulnAssessmentRelationship - can be null if copying is not required
	 * @param create true if SsvcVulnAssessmentRelationship is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the SsvcVulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	public SsvcVulnAssessmentRelationship(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the SsvcVulnAssessmentRelationship from the builder - used in the builder class
	 * @param builder Builder to create the SsvcVulnAssessmentRelationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the SsvcVulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	protected SsvcVulnAssessmentRelationship(SsvcVulnAssessmentRelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		if (Objects.nonNull(builder.decisionType)) {
			setDecisionType(builder.decisionType);
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Security.SsvcVulnAssessmentRelationship";
	}
	
	// Getters and Setters
	
	/**
	 * @param from the from to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setFrom(@Nullable Element from) throws InvalidSPDXAnalysisException {
		super.setFrom(from);
		return this;
	}	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param assessedElement the assessedElement to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setAssessedElement(@Nullable Element assessedElement) throws InvalidSPDXAnalysisException {
		super.setAssessedElement(assessedElement);
		return this;
	}	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		super.setSuppliedBy(suppliedBy);
		return this;
	}	
	/**
	 * @param completeness the completeness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setCompleteness(@Nullable RelationshipCompleteness completeness) throws InvalidSPDXAnalysisException {
		super.setCompleteness(completeness);
		return this;
	}	
	/**
	 * @return the decisionType
	 */
	public @Nullable SsvcDecisionType getDecisionType() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_DECISION_TYPE);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof SsvcDecisionType)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for decisionType");
			}
			return (SsvcDecisionType)(retval.get());
		} else {
			return null;
		}
	}
	/**
	 * @param decisionType the decisionType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SsvcVulnAssessmentRelationship setDecisionType(@Nullable SsvcDecisionType decisionType) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(decisionType)) {
			throw new InvalidSPDXAnalysisException("decisionType is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_DECISION_TYPE, decisionType);
		return this;
	}
	/**
	 * @param relationshipType the relationshipType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setRelationshipType(@Nullable RelationshipType relationshipType) throws InvalidSPDXAnalysisException {
		super.setRelationshipType(relationshipType);
		return this;
	}	
	/**
	 * @param publishedTime the publishedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setPublishedTime(@Nullable String publishedTime) throws InvalidSPDXAnalysisException {
		super.setPublishedTime(publishedTime);
		return this;
	}	
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param endTime the endTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setEndTime(@Nullable String endTime) throws InvalidSPDXAnalysisException {
		super.setEndTime(endTime);
		return this;
	}	
	/**
	 * @param startTime the startTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setStartTime(@Nullable String startTime) throws InvalidSPDXAnalysisException {
		super.setStartTime(startTime);
		return this;
	}	
	/**
	 * @param withdrawnTime the withdrawnTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setWithdrawnTime(@Nullable String withdrawnTime) throws InvalidSPDXAnalysisException {
		super.setWithdrawnTime(withdrawnTime);
		return this;
	}	
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
	/**
	 * @param modifiedTime the modifiedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SsvcVulnAssessmentRelationship setModifiedTime(@Nullable String modifiedTime) throws InvalidSPDXAnalysisException {
		super.setModifiedTime(modifiedTime);
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
		try {
			SsvcDecisionType decisionType = getDecisionType();
			if (Objects.isNull(decisionType) && 
						Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SECURITY }))) {
				retval.add("Missing decisionType in SsvcVulnAssessmentRelationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting decisionType for SsvcVulnAssessmentRelationship: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class SsvcVulnAssessmentRelationshipBuilder extends VulnAssessmentRelationshipBuilder {
	
		/**
		 * Create an SsvcVulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public SsvcVulnAssessmentRelationshipBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an SsvcVulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public SsvcVulnAssessmentRelationshipBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a SsvcVulnAssessmentRelationshipBuilder
		 * @param modelStore model store for the built SsvcVulnAssessmentRelationship
		 * @param objectUri objectUri for the built SsvcVulnAssessmentRelationship
		 * @param copyManager optional copyManager for the built SsvcVulnAssessmentRelationship
		 */
		public SsvcVulnAssessmentRelationshipBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected SsvcDecisionType decisionType = null;
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder addExtension(Extension extension) {
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
		public SsvcVulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public SsvcVulnAssessmentRelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public SsvcVulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
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
		public SsvcVulnAssessmentRelationshipBuilder addTo(Element to) {
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
		public SsvcVulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
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
		public SsvcVulnAssessmentRelationshipBuilder addExternalRef(ExternalRef externalRef) {
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
		public SsvcVulnAssessmentRelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public SsvcVulnAssessmentRelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public SsvcVulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
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
		public SsvcVulnAssessmentRelationshipBuilder setFrom(Element from) {
			super.from = from;
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of assessedElement
		 * @parameter assessedElement value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setAssessedElement(Element assessedElement) {
			super.assessedElement = assessedElement;
			return this;
		}
		
		/**
		 * Sets the initial value of suppliedBy
		 * @parameter suppliedBy value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
			super.suppliedBy = suppliedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of completeness
		 * @parameter completeness value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
			super.completeness = completeness;
			return this;
		}
		
		/**
		 * Sets the initial value of decisionType
		 * @parameter decisionType value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setDecisionType(SsvcDecisionType decisionType) {
			this.decisionType = decisionType;
			return this;
		}
		
		/**
		 * Sets the initial value of relationshipType
		 * @parameter relationshipType value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
			super.relationshipType = relationshipType;
			return this;
		}
		
		/**
		 * Sets the initial value of publishedTime
		 * @parameter publishedTime value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
			super.publishedTime = publishedTime;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of endTime
		 * @parameter endTime value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setEndTime(String endTime) {
			super.endTime = endTime;
			return this;
		}
		
		/**
		 * Sets the initial value of startTime
		 * @parameter startTime value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setStartTime(String startTime) {
			super.startTime = startTime;
			return this;
		}
		
		/**
		 * Sets the initial value of withdrawnTime
		 * @parameter withdrawnTime value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
			super.withdrawnTime = withdrawnTime;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of modifiedTime
		 * @parameter modifiedTime value to set
		 * @return this for chaining
		**/
		public SsvcVulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
			super.modifiedTime = modifiedTime;
			return this;
		}
	
		/**
		 * @return the SsvcVulnAssessmentRelationship
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public SsvcVulnAssessmentRelationship build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new SsvcVulnAssessmentRelationship(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}
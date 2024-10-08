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
 * Provides a CVSS version 3 assessment for a vulnerability. 
 */
public  class CvssV3VulnAssessmentRelationship extends VulnAssessmentRelationship  {

	
	/**
	 * Create the CvssV3VulnAssessmentRelationship with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV3VulnAssessmentRelationship
	 */
	public CvssV3VulnAssessmentRelationship() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the CvssV3VulnAssessmentRelationship
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV3VulnAssessmentRelationship
	 */
	public CvssV3VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the CvssV3VulnAssessmentRelationship is to be stored
	 * @param objectUri URI or anonymous ID for the CvssV3VulnAssessmentRelationship
	 * @param copyManager Copy manager for the CvssV3VulnAssessmentRelationship - can be null if copying is not required
	 * @param create true if CvssV3VulnAssessmentRelationship is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV3VulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	public CvssV3VulnAssessmentRelationship(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the CvssV3VulnAssessmentRelationship from the builder - used in the builder class
	 * @param builder Builder to create the CvssV3VulnAssessmentRelationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV3VulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	protected CvssV3VulnAssessmentRelationship(CvssV3VulnAssessmentRelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		if (Objects.nonNull(builder.severity)) {
			setSeverity(builder.severity);
		}
		if (Objects.nonNull(builder.score)) {
			setScore(builder.score);
		}
		if (Objects.nonNull(builder.vectorString)) {
			setVectorString(builder.vectorString);
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Security.CvssV3VulnAssessmentRelationship";
	}
	
	// Getters and Setters
	
	/**
	 * @param from the from to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setFrom(@Nullable Element from) throws InvalidSPDXAnalysisException {
		super.setFrom(from);
		return this;
	}	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param assessedElement the assessedElement to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setAssessedElement(@Nullable Element assessedElement) throws InvalidSPDXAnalysisException {
		super.setAssessedElement(assessedElement);
		return this;
	}	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		super.setSuppliedBy(suppliedBy);
		return this;
	}	
	/**
	 * @return the severity
	 */
	public @Nullable CvssSeverityType getSeverity() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_SEVERITY);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof CvssSeverityType)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for severity");
			}
			return (CvssSeverityType)(retval.get());
		} else {
			return null;
		}
	}
	/**
	 * @param severity the severity to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV3VulnAssessmentRelationship setSeverity(@Nullable CvssSeverityType severity) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(severity)) {
			throw new InvalidSPDXAnalysisException("severity is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_SEVERITY, severity);
		return this;
	}
	/**
	 * @param completeness the completeness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setCompleteness(@Nullable RelationshipCompleteness completeness) throws InvalidSPDXAnalysisException {
		super.setCompleteness(completeness);
		return this;
	}	
	/**
	 * @param relationshipType the relationshipType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setRelationshipType(@Nullable RelationshipType relationshipType) throws InvalidSPDXAnalysisException {
		super.setRelationshipType(relationshipType);
		return this;
	}	
	/**
	 * @return the score
	 */
	public @Nullable Integer getScore() throws InvalidSPDXAnalysisException {
		Optional<Integer> retval = getIntegerPropertyValue(SpdxConstantsV3.PROP_SCORE);
		return retval.isPresent() ? retval.get() : null;
	}
	
	/**
	 * @param score the score to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV3VulnAssessmentRelationship setScore(@Nullable Integer score) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(score)) {
			throw new InvalidSPDXAnalysisException("score is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_SCORE, score);
		return this;
	}
	/**
	 * @return the vectorString
	 */
	public @Nullable String getVectorString() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_VECTOR_STRING);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param vectorString the vectorString to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV3VulnAssessmentRelationship setVectorString(@Nullable String vectorString) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(vectorString)) {
			throw new InvalidSPDXAnalysisException("vectorString is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_VECTOR_STRING, vectorString);
		return this;
	}
	/**
	 * @param publishedTime the publishedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setPublishedTime(@Nullable String publishedTime) throws InvalidSPDXAnalysisException {
		super.setPublishedTime(publishedTime);
		return this;
	}	
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param endTime the endTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setEndTime(@Nullable String endTime) throws InvalidSPDXAnalysisException {
		super.setEndTime(endTime);
		return this;
	}	
	/**
	 * @param startTime the startTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setStartTime(@Nullable String startTime) throws InvalidSPDXAnalysisException {
		super.setStartTime(startTime);
		return this;
	}	
	/**
	 * @param withdrawnTime the withdrawnTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setWithdrawnTime(@Nullable String withdrawnTime) throws InvalidSPDXAnalysisException {
		super.setWithdrawnTime(withdrawnTime);
		return this;
	}	
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
	/**
	 * @param modifiedTime the modifiedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CvssV3VulnAssessmentRelationship setModifiedTime(@Nullable String modifiedTime) throws InvalidSPDXAnalysisException {
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
			CvssSeverityType severity = getSeverity();
			if (Objects.isNull(severity) && 
						Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SECURITY }))) {
				retval.add("Missing severity in CvssV3VulnAssessmentRelationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting severity for CvssV3VulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			Integer score = getScore();
			if (Objects.isNull(score) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SECURITY }))) {
				retval.add("Missing score in CvssV3VulnAssessmentRelationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting score for CvssV3VulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			String vectorString = getVectorString();
			if (Objects.isNull(vectorString) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SECURITY }))) {
				retval.add("Missing vectorString in CvssV3VulnAssessmentRelationship");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting vectorString for CvssV3VulnAssessmentRelationship: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class CvssV3VulnAssessmentRelationshipBuilder extends VulnAssessmentRelationshipBuilder {
	
		/**
		 * Create an CvssV3VulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public CvssV3VulnAssessmentRelationshipBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an CvssV3VulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public CvssV3VulnAssessmentRelationshipBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a CvssV3VulnAssessmentRelationshipBuilder
		 * @param modelStore model store for the built CvssV3VulnAssessmentRelationship
		 * @param objectUri objectUri for the built CvssV3VulnAssessmentRelationship
		 * @param copyManager optional copyManager for the built CvssV3VulnAssessmentRelationship
		 */
		public CvssV3VulnAssessmentRelationshipBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected CvssSeverityType severity = null;
		protected Integer score = null;
		protected String vectorString = null;
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder addExtension(Extension extension) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addTo(Element to) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addExternalRef(ExternalRef externalRef) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public CvssV3VulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
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
		public CvssV3VulnAssessmentRelationshipBuilder setFrom(Element from) {
			super.from = from;
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of assessedElement
		 * @parameter assessedElement value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setAssessedElement(Element assessedElement) {
			super.assessedElement = assessedElement;
			return this;
		}
		
		/**
		 * Sets the initial value of suppliedBy
		 * @parameter suppliedBy value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
			super.suppliedBy = suppliedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of severity
		 * @parameter severity value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setSeverity(CvssSeverityType severity) {
			this.severity = severity;
			return this;
		}
		
		/**
		 * Sets the initial value of completeness
		 * @parameter completeness value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
			super.completeness = completeness;
			return this;
		}
		
		/**
		 * Sets the initial value of relationshipType
		 * @parameter relationshipType value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
			super.relationshipType = relationshipType;
			return this;
		}
		
		/**
		 * Sets the initial value of score
		 * @parameter score value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setScore(Integer score) {
			this.score = score;
			return this;
		}
		
		/**
		 * Sets the initial value of vectorString
		 * @parameter vectorString value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setVectorString(String vectorString) {
			this.vectorString = vectorString;
			return this;
		}
		
		/**
		 * Sets the initial value of publishedTime
		 * @parameter publishedTime value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
			super.publishedTime = publishedTime;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of endTime
		 * @parameter endTime value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setEndTime(String endTime) {
			super.endTime = endTime;
			return this;
		}
		
		/**
		 * Sets the initial value of startTime
		 * @parameter startTime value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setStartTime(String startTime) {
			super.startTime = startTime;
			return this;
		}
		
		/**
		 * Sets the initial value of withdrawnTime
		 * @parameter withdrawnTime value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
			super.withdrawnTime = withdrawnTime;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of modifiedTime
		 * @parameter modifiedTime value to set
		 * @return this for chaining
		**/
		public CvssV3VulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
			super.modifiedTime = modifiedTime;
			return this;
		}
	
		/**
		 * @return the CvssV3VulnAssessmentRelationship
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public CvssV3VulnAssessmentRelationship build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new CvssV3VulnAssessmentRelationship(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}

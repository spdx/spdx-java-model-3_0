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

import org.spdx.storage.NullModelStore;
import org.spdx.core.IndividualUriValue;
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
 * This is an external representation of CvssV4VulnAssessmentRelationship - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalCvssV4VulnAssessmentRelationship extends CvssV4VulnAssessmentRelationship  implements IndividualUriValue {

	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<Element> tos = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the CvssV4VulnAssessmentRelationship
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV4VulnAssessmentRelationship
	 */
	public ExternalCvssV4VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalCvssV4VulnAssessmentRelationship
	 */
	public ExternalCvssV4VulnAssessmentRelationship(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the CvssV4VulnAssessmentRelationship from the builder - used in the builder class
	 * @param builder Builder to create the CvssV4VulnAssessmentRelationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the CvssV4VulnAssessmentRelationship
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalCvssV4VulnAssessmentRelationship(CvssV4VulnAssessmentRelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
	}
	
	@Override
	public boolean isExternal() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.IndividualUriValue#getIndividualURI()
	 */
	@Override
	public String getIndividualURI() {
		return getObjectUri();
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Security.ExternalCvssV4VulnAssessmentRelationship";
	}
	
	// Getters and Setters
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<Element> getTos() {
		return tos;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	
	/**
	 * @return the from
	 */
	public @Nullable Element getFrom() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param from the from to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setFrom(@Nullable Element from) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the creationInfo
	 */
	public @Nullable CreationInfo getCreationInfo() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the assessedElement
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Element> getAssessedElement() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param assessedElement the assessedElement to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setAssessedElement(@Nullable Element assessedElement) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the suppliedBy
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Agent> getSuppliedBy() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the severity
	 */
	public @Nullable CvssSeverityType getSeverity() throws InvalidSPDXAnalysisException {
		return null;
	}
	/**
	 * @param severity the severity to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setSeverity(@Nullable CvssSeverityType severity) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the completeness
	 */
	 @SuppressWarnings("unchecked")
	public Optional<RelationshipCompleteness> getCompleteness() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param completeness the completeness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setCompleteness(@Nullable RelationshipCompleteness completeness) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the relationshipType
	 */
	public @Nullable RelationshipType getRelationshipType() throws InvalidSPDXAnalysisException {
		return null;
	}
	/**
	 * @param relationshipType the relationshipType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setRelationshipType(@Nullable RelationshipType relationshipType) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the score
	 */
	public @Nullable Integer getScore() throws InvalidSPDXAnalysisException {
		return null;
	}
	
	/**
	 * @param score the score to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setScore(@Nullable Integer score) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the vectorString
	 */
	public @Nullable String getVectorString() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param vectorString the vectorString to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setVectorString(@Nullable String vectorString) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the publishedTime
	 */
	public Optional<String> getPublishedTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param publishedTime the publishedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setPublishedTime(@Nullable String publishedTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the summary
	 */
	public Optional<String> getSummary() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the description
	 */
	public Optional<String> getDescription() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the endTime
	 */
	public Optional<String> getEndTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param endTime the endTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setEndTime(@Nullable String endTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the startTime
	 */
	public Optional<String> getStartTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param startTime the startTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setStartTime(@Nullable String startTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the withdrawnTime
	 */
	public Optional<String> getWithdrawnTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param withdrawnTime the withdrawnTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setWithdrawnTime(@Nullable String withdrawnTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the comment
	 */
	public Optional<String> getComment() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the name
	 */
	public Optional<String> getName() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the modifiedTime
	 */
	public Optional<String> getModifiedTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param modifiedTime the modifiedTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CvssV4VulnAssessmentRelationship setModifiedTime(@Nullable String modifiedTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
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
		return new ArrayList<>();
	}
}

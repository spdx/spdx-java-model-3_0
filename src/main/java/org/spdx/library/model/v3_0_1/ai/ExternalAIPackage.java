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
 
package org.spdx.library.model.v3_0_1.ai;

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
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.PresenceType;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier;
import org.spdx.library.model.v3_0_1.software.SoftwarePurpose;
import org.spdx.library.model.v3_0_1.software.SpdxPackage;

/**
 * This is an external representation of AIPackage - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalAIPackage extends AIPackage  implements IndividualUriValue {

	Collection<ContentIdentifier> contentIdentifiers = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<DictionaryEntry> hyperparameters = Collections.emptyList();
	Collection<DictionaryEntry> metrics = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<DictionaryEntry> metricDecisionThresholds = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<Agent> originatedBys = Collections.emptyList();
	Collection<String> modelDataPreprocessings = Collections.emptyList();
	Collection<String> domains = Collections.emptyList();
	Collection<String> attributionTexts = Collections.emptyList();
	Collection<String> typeOfModels = Collections.emptyList();
	Collection<String> standardNames = Collections.emptyList();
	Collection<String> standardCompliances = Collections.emptyList();
	Collection<String> modelExplainabilitys = Collections.emptyList();
	Collection<SupportType> supportLevels = Collections.emptyList();
	Collection<SoftwarePurpose> additionalPurposes = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the AIPackage
	 * @throws InvalidSPDXAnalysisException when unable to create the AIPackage
	 */
	public ExternalAIPackage(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalAIPackage
	 */
	public ExternalAIPackage(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the AIPackage from the builder - used in the builder class
	 * @param builder Builder to create the AIPackage from
	 * @throws InvalidSPDXAnalysisException when unable to create the AIPackage
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalAIPackage(AIPackageBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "AI.ExternalAIPackage";
	}
	
	// Getters and Setters
	public Collection<ContentIdentifier> getContentIdentifiers() {
		return contentIdentifiers;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<DictionaryEntry> getHyperparameters() {
		return hyperparameters;
	}
	public Collection<DictionaryEntry> getMetrics() {
		return metrics;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<DictionaryEntry> getMetricDecisionThresholds() {
		return metricDecisionThresholds;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<Agent> getOriginatedBys() {
		return originatedBys;
	}
	public Collection<SupportType> getSupportLevels() {
		return supportLevels;
	}
	public Collection<SoftwarePurpose> getAdditionalPurposes() {
		return additionalPurposes;
	}
	public Collection<String> getModelDataPreprocessings() {
		return modelDataPreprocessings;
	}
	public Collection<String> getDomains() {
		return domains;
	}
	public Collection<String> getAttributionTexts() {
		return attributionTexts;
	}
	public Collection<String> getTypeOfModels() {
		return typeOfModels;
	}
	public Collection<String> getStandardNames() {
		return standardNames;
	}
	public Collection<String> getStandardCompliances() {
		return standardCompliances;
	}
	public Collection<String> getModelExplainabilitys() {
		return modelExplainabilitys;
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
	public AIPackage setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the energyConsumption
	 */
	 @SuppressWarnings("unchecked")
	public Optional<EnergyConsumption> getEnergyConsumption() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param energyConsumption the energyConsumption to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setEnergyConsumption(@Nullable EnergyConsumption energyConsumption) throws InvalidSPDXAnalysisException {
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
	public AIPackage setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the autonomyType
	 */
	 @SuppressWarnings("unchecked")
	public Optional<PresenceType> getAutonomyType() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param autonomyType the autonomyType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setAutonomyType(@Nullable PresenceType autonomyType) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the useSensitivePersonalInformation
	 */
	 @SuppressWarnings("unchecked")
	public Optional<PresenceType> getUseSensitivePersonalInformation() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param useSensitivePersonalInformation the useSensitivePersonalInformation to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setUseSensitivePersonalInformation(@Nullable PresenceType useSensitivePersonalInformation) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the safetyRiskAssessment
	 */
	 @SuppressWarnings("unchecked")
	public Optional<SafetyRiskAssessmentType> getSafetyRiskAssessment() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param safetyRiskAssessment the safetyRiskAssessment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setSafetyRiskAssessment(@Nullable SafetyRiskAssessmentType safetyRiskAssessment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the primaryPurpose
	 */
	 @SuppressWarnings("unchecked")
	public Optional<SoftwarePurpose> getPrimaryPurpose() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param primaryPurpose the primaryPurpose to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setPrimaryPurpose(@Nullable SoftwarePurpose primaryPurpose) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the validUntilTime
	 */
	public Optional<String> getValidUntilTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param validUntilTime the validUntilTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the downloadLocation
	 */
	public Optional<String> getDownloadLocation() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param downloadLocation the downloadLocation to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setDownloadLocation(@Nullable String downloadLocation) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the builtTime
	 */
	public Optional<String> getBuiltTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param builtTime the builtTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
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
	public AIPackage setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the packageVersion
	 */
	public Optional<String> getPackageVersion() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param packageVersion the packageVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setPackageVersion(@Nullable String packageVersion) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the releaseTime
	 */
	public Optional<String> getReleaseTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param releaseTime the releaseTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the copyrightText
	 */
	public Optional<String> getCopyrightText() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param copyrightText the copyrightText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setCopyrightText(@Nullable String copyrightText) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the informationAboutTraining
	 */
	public Optional<String> getInformationAboutTraining() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param informationAboutTraining the informationAboutTraining to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setInformationAboutTraining(@Nullable String informationAboutTraining) throws InvalidSPDXAnalysisException {
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
	public AIPackage setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the homePage
	 */
	public Optional<String> getHomePage() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param homePage the homePage to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setHomePage(@Nullable String homePage) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the sourceInfo
	 */
	public Optional<String> getSourceInfo() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param sourceInfo the sourceInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setSourceInfo(@Nullable String sourceInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the limitation
	 */
	public Optional<String> getLimitation() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param limitation the limitation to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setLimitation(@Nullable String limitation) throws InvalidSPDXAnalysisException {
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
	public AIPackage setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public AIPackage setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the packageUrl
	 */
	public Optional<String> getPackageUrl() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param packageUrl the packageUrl to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setPackageUrl(@Nullable String packageUrl) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the informationAboutApplication
	 */
	public Optional<String> getInformationAboutApplication() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param informationAboutApplication the informationAboutApplication to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public AIPackage setInformationAboutApplication(@Nullable String informationAboutApplication) throws InvalidSPDXAnalysisException {
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

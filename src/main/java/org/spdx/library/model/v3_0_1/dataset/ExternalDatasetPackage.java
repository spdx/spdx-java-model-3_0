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
 
package org.spdx.library.model.v3_0_1.dataset;

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
 * This is an external representation of DatasetPackage - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalDatasetPackage extends DatasetPackage  implements IndividualUriValue {

	Collection<ContentIdentifier> contentIdentifiers = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<DictionaryEntry> sensors = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<Agent> originatedBys = Collections.emptyList();
	Collection<String> attributionTexts = Collections.emptyList();
	Collection<String> standardNames = Collections.emptyList();
	Collection<String> anonymizationMethodUseds = Collections.emptyList();
	Collection<String> knownBiass = Collections.emptyList();
	Collection<String> dataPreprocessings = Collections.emptyList();
	Collection<SupportType> supportLevels = Collections.emptyList();
	Collection<SoftwarePurpose> additionalPurposes = Collections.emptyList();
	Collection<DatasetType> datasetTypes = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the DatasetPackage
	 * @throws InvalidSPDXAnalysisException when unable to create the DatasetPackage
	 */
	public ExternalDatasetPackage(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalDatasetPackage
	 */
	public ExternalDatasetPackage(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the DatasetPackage from the builder - used in the builder class
	 * @param builder Builder to create the DatasetPackage from
	 * @throws InvalidSPDXAnalysisException when unable to create the DatasetPackage
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalDatasetPackage(DatasetPackageBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "Dataset.ExternalDatasetPackage";
	}
	
	// Getters and Setters
	public Collection<ContentIdentifier> getContentIdentifiers() {
		return contentIdentifiers;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<DictionaryEntry> getSensors() {
		return sensors;
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
	public Collection<DatasetType> getDatasetTypes() {
		return datasetTypes;
	}
	public Collection<String> getAttributionTexts() {
		return attributionTexts;
	}
	public Collection<String> getStandardNames() {
		return standardNames;
	}
	public Collection<String> getAnonymizationMethodUseds() {
		return anonymizationMethodUseds;
	}
	public Collection<String> getKnownBiass() {
		return knownBiass;
	}
	public Collection<String> getDataPreprocessings() {
		return dataPreprocessings;
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
	public DatasetPackage setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the datasetAvailability
	 */
	 @SuppressWarnings("unchecked")
	public Optional<DatasetAvailabilityType> getDatasetAvailability() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param datasetAvailability the datasetAvailability to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setDatasetAvailability(@Nullable DatasetAvailabilityType datasetAvailability) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the confidentialityLevel
	 */
	 @SuppressWarnings("unchecked")
	public Optional<ConfidentialityLevelType> getConfidentialityLevel() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param confidentialityLevel the confidentialityLevel to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setConfidentialityLevel(@Nullable ConfidentialityLevelType confidentialityLevel) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the hasSensitivePersonalInformation
	 */
	 @SuppressWarnings("unchecked")
	public Optional<PresenceType> getHasSensitivePersonalInformation() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param hasSensitivePersonalInformation the hasSensitivePersonalInformation to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setHasSensitivePersonalInformation(@Nullable PresenceType hasSensitivePersonalInformation) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setPrimaryPurpose(@Nullable SoftwarePurpose primaryPurpose) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the datasetSize
	 */
	public Optional<Integer> getDatasetSize() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param datasetSize the datasetSize to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setDatasetSize(@Nullable Integer datasetSize) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setDownloadLocation(@Nullable String downloadLocation) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the datasetNoise
	 */
	public Optional<String> getDatasetNoise() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param datasetNoise the datasetNoise to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setDatasetNoise(@Nullable String datasetNoise) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setPackageVersion(@Nullable String packageVersion) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setCopyrightText(@Nullable String copyrightText) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setHomePage(@Nullable String homePage) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setSourceInfo(@Nullable String sourceInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the intendedUse
	 */
	public Optional<String> getIntendedUse() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param intendedUse the intendedUse to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setIntendedUse(@Nullable String intendedUse) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the dataCollectionProcess
	 */
	public Optional<String> getDataCollectionProcess() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param dataCollectionProcess the dataCollectionProcess to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setDataCollectionProcess(@Nullable String dataCollectionProcess) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the datasetUpdateMechanism
	 */
	public Optional<String> getDatasetUpdateMechanism() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param datasetUpdateMechanism the datasetUpdateMechanism to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public DatasetPackage setDatasetUpdateMechanism(@Nullable String datasetUpdateMechanism) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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
	public DatasetPackage setPackageUrl(@Nullable String packageUrl) throws InvalidSPDXAnalysisException {
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

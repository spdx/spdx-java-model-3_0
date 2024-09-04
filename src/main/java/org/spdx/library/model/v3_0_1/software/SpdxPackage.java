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
 
package org.spdx.library.model.v3_0_1.software;

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
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Refers to any unit of content that can be associated with a distribution of software. 
 */
public  class SpdxPackage extends SoftwareArtifact  {

	
	/**
	 * Create the SpdxPackage with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxPackage
	 */
	public SpdxPackage() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the SpdxPackage
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxPackage
	 */
	public SpdxPackage(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the SpdxPackage is to be stored
	 * @param objectUri URI or anonymous ID for the SpdxPackage
	 * @param copyManager Copy manager for the SpdxPackage - can be null if copying is not required
	 * @param create true if SpdxPackage is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxPackage
	 */
	 @SuppressWarnings("unchecked")
	public SpdxPackage(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the SpdxPackage from the builder - used in the builder class
	 * @param builder Builder to create the SpdxPackage from
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxPackage
	 */
	 @SuppressWarnings("unchecked")
	protected SpdxPackage(SpdxPackageBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		setDownloadLocation(builder.downloadLocation);
		setPackageVersion(builder.packageVersion);
		setHomePage(builder.homePage);
		setSourceInfo(builder.sourceInfo);
		setPackageUrl(builder.packageUrl);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Software.SpdxPackage";
	}
	
	// Getters and Setters
	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		super.setSuppliedBy(suppliedBy);
		return this;
	}	
	/**
	 * @param primaryPurpose the primaryPurpose to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setPrimaryPurpose(@Nullable SoftwarePurpose primaryPurpose) throws InvalidSPDXAnalysisException {
		super.setPrimaryPurpose(primaryPurpose);
		return this;
	}	
	/**
	 * @param validUntilTime the validUntilTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
		super.setValidUntilTime(validUntilTime);
		return this;
	}	
		/**
	 * @return the downloadLocation
	 */
	public Optional<String> getDownloadLocation() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_DOWNLOAD_LOCATION);
	}
	/**
	 * @param downloadLocation the downloadLocation to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxPackage setDownloadLocation(@Nullable String downloadLocation) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_DOWNLOAD_LOCATION, downloadLocation);
		return this;
	}
	/**
	 * @param builtTime the builtTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
		super.setBuiltTime(builtTime);
		return this;
	}	
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
		/**
	 * @return the packageVersion
	 */
	public Optional<String> getPackageVersion() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_PACKAGE_VERSION);
	}
	/**
	 * @param packageVersion the packageVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxPackage setPackageVersion(@Nullable String packageVersion) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_PACKAGE_VERSION, packageVersion);
		return this;
	}
	/**
	 * @param releaseTime the releaseTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
		super.setReleaseTime(releaseTime);
		return this;
	}	
	/**
	 * @param copyrightText the copyrightText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setCopyrightText(@Nullable String copyrightText) throws InvalidSPDXAnalysisException {
		super.setCopyrightText(copyrightText);
		return this;
	}	
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
		/**
	 * @return the homePage
	 */
	public Optional<String> getHomePage() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_HOME_PAGE);
	}
	/**
	 * @param homePage the homePage to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxPackage setHomePage(@Nullable String homePage) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_HOME_PAGE, homePage);
		return this;
	}
		/**
	 * @return the sourceInfo
	 */
	public Optional<String> getSourceInfo() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_SOURCE_INFO);
	}
	/**
	 * @param sourceInfo the sourceInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxPackage setSourceInfo(@Nullable String sourceInfo) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_SOURCE_INFO, sourceInfo);
		return this;
	}
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SpdxPackage setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
		/**
	 * @return the packageUrl
	 */
	public Optional<String> getPackageUrl() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_PACKAGE_URL);
	}
	/**
	 * @param packageUrl the packageUrl to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxPackage setPackageUrl(@Nullable String packageUrl) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_PACKAGE_URL, packageUrl);
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
			@SuppressWarnings("unused")
			Optional<String> downloadLocation = getDownloadLocation();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting downloadLocation for SpdxPackage: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> packageVersion = getPackageVersion();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting packageVersion for SpdxPackage: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> homePage = getHomePage();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting homePage for SpdxPackage: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> sourceInfo = getSourceInfo();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting sourceInfo for SpdxPackage: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> packageUrl = getPackageUrl();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting packageUrl for SpdxPackage: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class SpdxPackageBuilder extends SoftwareArtifactBuilder {
	
		/**
		 * Create an SpdxPackageBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public SpdxPackageBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an SpdxPackageBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public SpdxPackageBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a SpdxPackageBuilder
		 * @param modelStore model store for the built SpdxPackage
		 * @param objectUri objectUri for the built SpdxPackage
		 * @param copyManager optional copyManager for the built SpdxPackage
		 */
		public SpdxPackageBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected String downloadLocation = null;
		protected String packageVersion = null;
		protected String homePage = null;
		protected String sourceInfo = null;
		protected String packageUrl = null;
		
		
		/**
		 * Adds a contentIdentifier to the initial collection
		 * @parameter contentIdentifier contentIdentifier to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addContentIdentifier(ContentIdentifier contentIdentifier) {
			if (Objects.nonNull(contentIdentifier)) {
				super.contentIdentifiers.add(contentIdentifier);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial contentIdentifier collection
		 * @parameter contentIdentifierCollection collection to initialize the contentIdentifier
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllContentIdentifier(Collection<ContentIdentifier> contentIdentifierCollection) {
			if (Objects.nonNull(contentIdentifierCollection)) {
				super.contentIdentifiers.addAll(contentIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Adds a verifiedUsing to the initial collection
		 * @parameter verifiedUsing verifiedUsing to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public SpdxPackageBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
			if (Objects.nonNull(verifiedUsingCollection)) {
				super.verifiedUsings.addAll(verifiedUsingCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addExternalRef(ExternalRef externalRef) {
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
		public SpdxPackageBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public SpdxPackageBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public SpdxPackageBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				super.externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addExtension(Extension extension) {
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
		public SpdxPackageBuilder addAllExtension(Collection<Extension> extensionCollection) {
			if (Objects.nonNull(extensionCollection)) {
				super.extensions.addAll(extensionCollection);
			}
			return this;
		}
		
		/**
		 * Adds a originatedBy to the initial collection
		 * @parameter originatedBy originatedBy to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addOriginatedBy(Agent originatedBy) {
			if (Objects.nonNull(originatedBy)) {
				super.originatedBys.add(originatedBy);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial originatedBy collection
		 * @parameter originatedByCollection collection to initialize the originatedBy
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
			if (Objects.nonNull(originatedByCollection)) {
				super.originatedBys.addAll(originatedByCollection);
			}
			return this;
		}
		
		/**
		 * Adds a supportLevel to the initial collection
		 * @parameter supportLevel supportLevel to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addSupportLevel(SupportType supportLevel) {
			if (Objects.nonNull(supportLevel)) {
				super.supportLevels.add(supportLevel);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial supportLevel collection
		 * @parameter supportLevelCollection collection to initialize the supportLevel
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
			if (Objects.nonNull(supportLevelCollection)) {
				super.supportLevels.addAll(supportLevelCollection);
			}
			return this;
		}
		
		/**
		 * Adds a additionalPurpose to the initial collection
		 * @parameter additionalPurpose additionalPurpose to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAdditionalPurpose(SoftwarePurpose additionalPurpose) {
			if (Objects.nonNull(additionalPurpose)) {
				super.additionalPurposes.add(additionalPurpose);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial additionalPurpose collection
		 * @parameter additionalPurposeCollection collection to initialize the additionalPurpose
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllAdditionalPurpose(Collection<SoftwarePurpose> additionalPurposeCollection) {
			if (Objects.nonNull(additionalPurposeCollection)) {
				super.additionalPurposes.addAll(additionalPurposeCollection);
			}
			return this;
		}
		
		/**
		 * Adds a attributionText to the initial collection
		 * @parameter attributionText attributionText to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAttributionText(String attributionText) {
			if (Objects.nonNull(attributionText)) {
				super.attributionTexts.add(attributionText);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial attributionText collection
		 * @parameter attributionTextCollection collection to initialize the attributionText
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllAttributionText(Collection<String> attributionTextCollection) {
			if (Objects.nonNull(attributionTextCollection)) {
				super.attributionTexts.addAll(attributionTextCollection);
			}
			return this;
		}
		
		/**
		 * Adds a standardName to the initial collection
		 * @parameter standardName standardName to add
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addStandardName(String standardName) {
			if (Objects.nonNull(standardName)) {
				super.standardNames.add(standardName);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial standardName collection
		 * @parameter standardNameCollection collection to initialize the standardName
		 * @return this for chaining
		**/
		public SpdxPackageBuilder addAllStandardName(Collection<String> standardNameCollection) {
			if (Objects.nonNull(standardNameCollection)) {
				super.standardNames.addAll(standardNameCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of suppliedBy
		 * @parameter suppliedBy value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setSuppliedBy(Agent suppliedBy) {
			super.suppliedBy = suppliedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of primaryPurpose
		 * @parameter primaryPurpose value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setPrimaryPurpose(SoftwarePurpose primaryPurpose) {
			super.primaryPurpose = primaryPurpose;
			return this;
		}
		
		/**
		 * Sets the initial value of validUntilTime
		 * @parameter validUntilTime value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setValidUntilTime(String validUntilTime) {
			super.validUntilTime = validUntilTime;
			return this;
		}
		
		/**
		 * Sets the initial value of downloadLocation
		 * @parameter downloadLocation value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setDownloadLocation(String downloadLocation) {
			this.downloadLocation = downloadLocation;
			return this;
		}
		
		/**
		 * Sets the initial value of builtTime
		 * @parameter builtTime value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setBuiltTime(String builtTime) {
			super.builtTime = builtTime;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of packageVersion
		 * @parameter packageVersion value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
			return this;
		}
		
		/**
		 * Sets the initial value of releaseTime
		 * @parameter releaseTime value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setReleaseTime(String releaseTime) {
			super.releaseTime = releaseTime;
			return this;
		}
		
		/**
		 * Sets the initial value of copyrightText
		 * @parameter copyrightText value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setCopyrightText(String copyrightText) {
			super.copyrightText = copyrightText;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of homePage
		 * @parameter homePage value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setHomePage(String homePage) {
			this.homePage = homePage;
			return this;
		}
		
		/**
		 * Sets the initial value of sourceInfo
		 * @parameter sourceInfo value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setSourceInfo(String sourceInfo) {
			this.sourceInfo = sourceInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of packageUrl
		 * @parameter packageUrl value to set
		 * @return this for chaining
		**/
		public SpdxPackageBuilder setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
			return this;
		}
	
		/**
		 * @return the SpdxPackage
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public SpdxPackage build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new SpdxPackage(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}

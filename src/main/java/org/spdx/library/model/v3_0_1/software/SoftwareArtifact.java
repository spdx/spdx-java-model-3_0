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
import org.spdx.library.model.v3_0_1.core.Artifact;
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
 * A distinct article or unit related to Software. 
 */
public abstract class SoftwareArtifact extends Artifact  {

	Collection<ContentIdentifier> contentIdentifiers = Collections.emptyList();
	Collection<String> attributionTexts = Collections.emptyList();
	Collection<SoftwarePurpose> additionalPurposes = Collections.emptyList();
	
	/**
	 * Create the SoftwareArtifact with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the SoftwareArtifact
	 */
	public SoftwareArtifact() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the SoftwareArtifact
	 * @throws InvalidSPDXAnalysisException when unable to create the SoftwareArtifact
	 */
	public SoftwareArtifact(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the SoftwareArtifact is to be stored
	 * @param objectUri URI or anonymous ID for the SoftwareArtifact
	 * @param copyManager Copy manager for the SoftwareArtifact - can be null if copying is not required
	 * @param create true if SoftwareArtifact is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the SoftwareArtifact
	 */
	 @SuppressWarnings("unchecked")
	public SoftwareArtifact(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
		if (!isExternal()) {
			contentIdentifiers = (Collection<ContentIdentifier>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER, ContentIdentifier.class);
		}
		if (!isExternal()) {
			additionalPurposes = (Collection<SoftwarePurpose>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_ADDITIONAL_PURPOSE, SoftwarePurpose.class);
		}
		if (!isExternal()) {
			attributionTexts = (Collection<String>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_ATTRIBUTION_TEXT, String.class);
		}
	}

	/**
	 * Create the SoftwareArtifact from the builder - used in the builder class
	 * @param builder Builder to create the SoftwareArtifact from
	 * @throws InvalidSPDXAnalysisException when unable to create the SoftwareArtifact
	 */
	 @SuppressWarnings("unchecked")
	protected SoftwareArtifact(SoftwareArtifactBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		contentIdentifiers = (Collection<ContentIdentifier>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER, ContentIdentifier.class);
		additionalPurposes = (Collection<SoftwarePurpose>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_ADDITIONAL_PURPOSE, SoftwarePurpose.class);
		attributionTexts = (Collection<String>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_ATTRIBUTION_TEXT, String.class);
		getContentIdentifiers().addAll(builder.contentIdentifiers);
		getAdditionalPurposes().addAll(builder.additionalPurposes);
		getAttributionTexts().addAll(builder.attributionTexts);
		setPrimaryPurpose(builder.primaryPurpose);
		setCopyrightText(builder.copyrightText);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Software.SoftwareArtifact";
	}
	
	// Getters and Setters
	public Collection<ContentIdentifier> getContentIdentifiers() {
		return contentIdentifiers;
	}
	public Collection<SoftwarePurpose> getAdditionalPurposes() {
		return additionalPurposes;
	}
	public Collection<String> getAttributionTexts() {
		return attributionTexts;
	}
	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param suppliedBy the suppliedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		super.setSuppliedBy(suppliedBy);
		return this;
	}	
	/**
	 * @return the primaryPurpose
	 */
	 @SuppressWarnings("unchecked")
	public Optional<SoftwarePurpose> getPrimaryPurpose() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_PRIMARY_PURPOSE);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof SoftwarePurpose)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for primaryPurpose");
			}
			return (Optional<SoftwarePurpose>)(Optional<?>)(retval);
		} else {
			return Optional.empty();
		}
	}
	/**
	 * @param primaryPurpose the primaryPurpose to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SoftwareArtifact setPrimaryPurpose(@Nullable SoftwarePurpose primaryPurpose) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_PRIMARY_PURPOSE, primaryPurpose);
		return this;
	}
	/**
	 * @param validUntilTime the validUntilTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
		super.setValidUntilTime(validUntilTime);
		return this;
	}	
	/**
	 * @param builtTime the builtTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
		super.setBuiltTime(builtTime);
		return this;
	}	
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param releaseTime the releaseTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
		super.setReleaseTime(releaseTime);
		return this;
	}	
		/**
	 * @return the copyrightText
	 */
	public Optional<String> getCopyrightText() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_COPYRIGHT_TEXT);
	}
	/**
	 * @param copyrightText the copyrightText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SoftwareArtifact setCopyrightText(@Nullable String copyrightText) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_COPYRIGHT_TEXT, copyrightText);
		return this;
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public SoftwareArtifact setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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
		try {
			@SuppressWarnings("unused")
			Optional<SoftwarePurpose> primaryPurpose = getPrimaryPurpose();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting primaryPurpose for SoftwareArtifact: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> copyrightText = getCopyrightText();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting copyrightText for SoftwareArtifact: "+e.getMessage());
		}
		for (ContentIdentifier contentIdentifier:contentIdentifiers) {
			retval.addAll(contentIdentifier.verify(verifiedIds, specVersionForVerify, profiles));
		}
		return retval;
	}
	
	
	
	public static abstract class SoftwareArtifactBuilder extends ArtifactBuilder {
	
		/**
		 * Create an SoftwareArtifactBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public SoftwareArtifactBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an SoftwareArtifactBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public SoftwareArtifactBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a SoftwareArtifactBuilder
		 * @param modelStore model store for the built SoftwareArtifact
		 * @param objectUri objectUri for the built SoftwareArtifact
		 * @param copyManager optional copyManager for the built SoftwareArtifact
		 */
		public SoftwareArtifactBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Collection<ContentIdentifier> contentIdentifiers = new ArrayList<>();
		protected Collection<SoftwarePurpose> additionalPurposes = new ArrayList<>();
		protected Collection<String> attributionTexts = new ArrayList<>();
		protected SoftwarePurpose primaryPurpose = null;
		protected String copyrightText = null;
		
		
		/**
		 * Adds a contentIdentifier to the initial collection
		 * @parameter contentIdentifier contentIdentifier to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addContentIdentifier(ContentIdentifier contentIdentifier) {
			if (Objects.nonNull(contentIdentifier)) {
				contentIdentifiers.add(contentIdentifier);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial contentIdentifier collection
		 * @parameter contentIdentifierCollection collection to initialize the contentIdentifier
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addAllContentIdentifier(Collection<ContentIdentifier> contentIdentifierCollection) {
			if (Objects.nonNull(contentIdentifierCollection)) {
				contentIdentifiers.addAll(contentIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addExtension(Extension extension) {
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
		public SoftwareArtifactBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public SoftwareArtifactBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public SoftwareArtifactBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
			if (Objects.nonNull(verifiedUsingCollection)) {
				super.verifiedUsings.addAll(verifiedUsingCollection);
			}
			return this;
		}
		
		/**
		 * Adds a originatedBy to the initial collection
		 * @parameter originatedBy originatedBy to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addOriginatedBy(Agent originatedBy) {
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
		public SoftwareArtifactBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
			if (Objects.nonNull(originatedByCollection)) {
				super.originatedBys.addAll(originatedByCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addExternalRef(ExternalRef externalRef) {
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
		public SoftwareArtifactBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public SoftwareArtifactBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public SoftwareArtifactBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				super.externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Adds a supportLevel to the initial collection
		 * @parameter supportLevel supportLevel to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addSupportLevel(SupportType supportLevel) {
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
		public SoftwareArtifactBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
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
		public SoftwareArtifactBuilder addAdditionalPurpose(SoftwarePurpose additionalPurpose) {
			if (Objects.nonNull(additionalPurpose)) {
				additionalPurposes.add(additionalPurpose);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial additionalPurpose collection
		 * @parameter additionalPurposeCollection collection to initialize the additionalPurpose
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addAllAdditionalPurpose(Collection<SoftwarePurpose> additionalPurposeCollection) {
			if (Objects.nonNull(additionalPurposeCollection)) {
				additionalPurposes.addAll(additionalPurposeCollection);
			}
			return this;
		}
		
		/**
		 * Adds a attributionText to the initial collection
		 * @parameter attributionText attributionText to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addAttributionText(String attributionText) {
			if (Objects.nonNull(attributionText)) {
				attributionTexts.add(attributionText);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial attributionText collection
		 * @parameter attributionTextCollection collection to initialize the attributionText
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addAllAttributionText(Collection<String> attributionTextCollection) {
			if (Objects.nonNull(attributionTextCollection)) {
				attributionTexts.addAll(attributionTextCollection);
			}
			return this;
		}
		
		/**
		 * Adds a standardName to the initial collection
		 * @parameter standardName standardName to add
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder addStandardName(String standardName) {
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
		public SoftwareArtifactBuilder addAllStandardName(Collection<String> standardNameCollection) {
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
		public SoftwareArtifactBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of suppliedBy
		 * @parameter suppliedBy value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setSuppliedBy(Agent suppliedBy) {
			super.suppliedBy = suppliedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of primaryPurpose
		 * @parameter primaryPurpose value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setPrimaryPurpose(SoftwarePurpose primaryPurpose) {
			this.primaryPurpose = primaryPurpose;
			return this;
		}
		
		/**
		 * Sets the initial value of validUntilTime
		 * @parameter validUntilTime value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setValidUntilTime(String validUntilTime) {
			super.validUntilTime = validUntilTime;
			return this;
		}
		
		/**
		 * Sets the initial value of builtTime
		 * @parameter builtTime value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setBuiltTime(String builtTime) {
			super.builtTime = builtTime;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of releaseTime
		 * @parameter releaseTime value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setReleaseTime(String releaseTime) {
			super.releaseTime = releaseTime;
			return this;
		}
		
		/**
		 * Sets the initial value of copyrightText
		 * @parameter copyrightText value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setCopyrightText(String copyrightText) {
			this.copyrightText = copyrightText;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public SoftwareArtifactBuilder setName(String name) {
			super.name = name;
			return this;
		}
	
		/**
		 * @return the SoftwareArtifact
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public abstract SoftwareArtifact build() throws InvalidSPDXAnalysisException;
	}
}

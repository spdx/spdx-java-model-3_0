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
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * This is an external representation of SpdxFile - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalSpdxFile extends SpdxFile  implements IndividualUriValue {

	Collection<ContentIdentifier> contentIdentifiers = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<Agent> originatedBys = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<String> attributionTexts = Collections.emptyList();
	Collection<String> standardNames = Collections.emptyList();
	Collection<SupportType> supportLevels = Collections.emptyList();
	Collection<SoftwarePurpose> additionalPurposes = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the SpdxFile
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxFile
	 */
	public ExternalSpdxFile(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalSpdxFile
	 */
	public ExternalSpdxFile(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the SpdxFile from the builder - used in the builder class
	 * @param builder Builder to create the SpdxFile from
	 * @throws InvalidSPDXAnalysisException when unable to create the SpdxFile
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalSpdxFile(SpdxFileBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "Software.ExternalSpdxFile";
	}
	
	// Getters and Setters
	public Collection<ContentIdentifier> getContentIdentifiers() {
		return contentIdentifiers;
	}
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<Agent> getOriginatedBys() {
		return originatedBys;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	public Collection<SupportType> getSupportLevels() {
		return supportLevels;
	}
	public Collection<SoftwarePurpose> getAdditionalPurposes() {
		return additionalPurposes;
	}
	public Collection<String> getAttributionTexts() {
		return attributionTexts;
	}
	public Collection<String> getStandardNames() {
		return standardNames;
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
	public SpdxFile setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setPrimaryPurpose(@Nullable SoftwarePurpose primaryPurpose) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the fileKind
	 */
	 @SuppressWarnings("unchecked")
	public Optional<FileKindType> getFileKind() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param fileKind the fileKind to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxFile setFileKind(@Nullable FileKindType fileKind) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setCopyrightText(@Nullable String copyrightText) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the contentType
	 */
	public Optional<String> getContentType() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param contentType the contentType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public SpdxFile setContentType(@Nullable String contentType) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public SpdxFile setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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

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
 
package org.spdx.library.model.v3_0_1.expandedlicensing;

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
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * This is an external representation of ListedLicense - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalListedLicense extends ListedLicense  implements IndividualUriValue {

	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<String> seeAlsos = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the ListedLicense
	 * @throws InvalidSPDXAnalysisException when unable to create the ListedLicense
	 */
	public ExternalListedLicense(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalListedLicense
	 */
	public ExternalListedLicense(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the ListedLicense from the builder - used in the builder class
	 * @param builder Builder to create the ListedLicense from
	 * @throws InvalidSPDXAnalysisException when unable to create the ListedLicense
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalListedLicense(ListedLicenseBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "ExpandedLicensing.ExternalListedLicense";
	}
	
	// Getters and Setters
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	public Collection<String> getSeeAlsos() {
		return seeAlsos;
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
	public ListedLicense setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the isFsfLibre
	 */
	public Optional<Boolean> getIsFsfLibre() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param isFsfLibre the isFsfLibre to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setIsFsfLibre(@Nullable Boolean isFsfLibre) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the isDeprecatedLicenseId
	 */
	public Optional<Boolean> getIsDeprecatedLicenseId() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param isDeprecatedLicenseId the isDeprecatedLicenseId to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setIsDeprecatedLicenseId(@Nullable Boolean isDeprecatedLicenseId) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the isOsiApproved
	 */
	public Optional<Boolean> getIsOsiApproved() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param isOsiApproved the isOsiApproved to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setIsOsiApproved(@Nullable Boolean isOsiApproved) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the licenseText
	 */
	public @Nullable String getLicenseText() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param licenseText the licenseText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setLicenseText(@Nullable String licenseText) throws InvalidSPDXAnalysisException {
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
	public ListedLicense setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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
	public ListedLicense setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the standardLicenseTemplate
	 */
	public Optional<String> getStandardLicenseTemplate() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param standardLicenseTemplate the standardLicenseTemplate to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setStandardLicenseTemplate(@Nullable String standardLicenseTemplate) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the obsoletedBy
	 */
	public Optional<String> getObsoletedBy() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param obsoletedBy the obsoletedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setObsoletedBy(@Nullable String obsoletedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the listVersionAdded
	 */
	public Optional<String> getListVersionAdded() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param listVersionAdded the listVersionAdded to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setListVersionAdded(@Nullable String listVersionAdded) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the licenseXml
	 */
	public Optional<String> getLicenseXml() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param licenseXml the licenseXml to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setLicenseXml(@Nullable String licenseXml) throws InvalidSPDXAnalysisException {
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
	public ListedLicense setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public ListedLicense setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the deprecatedVersion
	 */
	public Optional<String> getDeprecatedVersion() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param deprecatedVersion the deprecatedVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setDeprecatedVersion(@Nullable String deprecatedVersion) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the standardLicenseHeader
	 */
	public Optional<String> getStandardLicenseHeader() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param standardLicenseHeader the standardLicenseHeader to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ListedLicense setStandardLicenseHeader(@Nullable String standardLicenseHeader) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	
	
	@Override
	public String toString() {
				return this.getObjectUri().substring(SpdxConstantsV3.SPDX_LISTED_LICENSE_NAMESPACE.length());
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		return new ArrayList<>();
	}
}

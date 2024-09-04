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
 * This is an external representation of CustomLicenseAddition - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalCustomLicenseAddition extends CustomLicenseAddition  implements IndividualUriValue {

	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<String> seeAlsos = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the CustomLicenseAddition
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	public ExternalCustomLicenseAddition(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalCustomLicenseAddition
	 */
	public ExternalCustomLicenseAddition(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the CustomLicenseAddition from the builder - used in the builder class
	 * @param builder Builder to create the CustomLicenseAddition from
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalCustomLicenseAddition(CustomLicenseAdditionBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "ExpandedLicensing.ExternalCustomLicenseAddition";
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
	public CustomLicenseAddition setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the isDeprecatedAdditionId
	 */
	public Optional<Boolean> getIsDeprecatedAdditionId() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param isDeprecatedAdditionId the isDeprecatedAdditionId to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CustomLicenseAddition setIsDeprecatedAdditionId(@Nullable Boolean isDeprecatedAdditionId) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setObsoletedBy(@Nullable String obsoletedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the additionText
	 */
	public @Nullable String getAdditionText() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param additionText the additionText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CustomLicenseAddition setAdditionText(@Nullable String additionText) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setLicenseXml(@Nullable String licenseXml) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public CustomLicenseAddition setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the standardAdditionTemplate
	 */
	public Optional<String> getStandardAdditionTemplate() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param standardAdditionTemplate the standardAdditionTemplate to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CustomLicenseAddition setStandardAdditionTemplate(@Nullable String standardAdditionTemplate) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	
	
	@Override
	public String toString() {
		if (this.getObjectUri().contains("LicenseRef-")) {
			return (this.getObjectUri().substring(this.getObjectUri().lastIndexOf("LicenseRef-")));
		} else {
			return this.getObjectUri();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		return new ArrayList<>();
	}
}

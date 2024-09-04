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
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Abstract class for additional text intended to be added to a License, but which is 
 * not itself a standalone License. 
 */
public abstract class LicenseAddition extends Element  {

	Collection<String> seeAlsos = Collections.emptyList();
	
	/**
	 * Create the LicenseAddition with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the LicenseAddition
	 */
	public LicenseAddition() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the LicenseAddition
	 * @throws InvalidSPDXAnalysisException when unable to create the LicenseAddition
	 */
	public LicenseAddition(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the LicenseAddition is to be stored
	 * @param objectUri URI or anonymous ID for the LicenseAddition
	 * @param copyManager Copy manager for the LicenseAddition - can be null if copying is not required
	 * @param create true if LicenseAddition is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the LicenseAddition
	 */
	 @SuppressWarnings("unchecked")
	public LicenseAddition(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
		if (!isExternal()) {
			seeAlsos = (Collection<String>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_SEE_ALSO, String.class);
		}
	}

	/**
	 * Create the LicenseAddition from the builder - used in the builder class
	 * @param builder Builder to create the LicenseAddition from
	 * @throws InvalidSPDXAnalysisException when unable to create the LicenseAddition
	 */
	 @SuppressWarnings("unchecked")
	protected LicenseAddition(LicenseAdditionBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		seeAlsos = (Collection<String>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_SEE_ALSO, String.class);
		getSeeAlsos().addAll(builder.seeAlsos);
		setIsDeprecatedAdditionId(builder.isDeprecatedAdditionId);
		setObsoletedBy(builder.obsoletedBy);
		if (Objects.nonNull(builder.additionText)) {
			setAdditionText(builder.additionText);
		}
		setLicenseXml(builder.licenseXml);
		setStandardAdditionTemplate(builder.standardAdditionTemplate);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "ExpandedLicensing.LicenseAddition";
	}
	
	// Getters and Setters
	public Collection<String> getSeeAlsos() {
		return seeAlsos;
	}
	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public LicenseAddition setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
		/**
	 * @return the isDeprecatedAdditionId
	 */
	public Optional<Boolean> getIsDeprecatedAdditionId() throws InvalidSPDXAnalysisException {
		return getBooleanPropertyValue(SpdxConstantsV3.PROP_IS_DEPRECATED_ADDITION_ID);
	}
	
	/**
	 * @param isDeprecatedAdditionId the isDeprecatedAdditionId to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public LicenseAddition setIsDeprecatedAdditionId(@Nullable Boolean isDeprecatedAdditionId) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_IS_DEPRECATED_ADDITION_ID, isDeprecatedAdditionId);
		return this;
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public LicenseAddition setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public LicenseAddition setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
		/**
	 * @return the obsoletedBy
	 */
	public Optional<String> getObsoletedBy() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_OBSOLETED_BY);
	}
	/**
	 * @param obsoletedBy the obsoletedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public LicenseAddition setObsoletedBy(@Nullable String obsoletedBy) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_OBSOLETED_BY, obsoletedBy);
		return this;
	}
	/**
	 * @return the additionText
	 */
	public @Nullable String getAdditionText() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_ADDITION_TEXT);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param additionText the additionText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public LicenseAddition setAdditionText(@Nullable String additionText) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(additionText)) {
			throw new InvalidSPDXAnalysisException("additionText is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_ADDITION_TEXT, additionText);
		return this;
	}
		/**
	 * @return the licenseXml
	 */
	public Optional<String> getLicenseXml() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_LICENSE_XML);
	}
	/**
	 * @param licenseXml the licenseXml to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public LicenseAddition setLicenseXml(@Nullable String licenseXml) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_LICENSE_XML, licenseXml);
		return this;
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public LicenseAddition setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public LicenseAddition setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
		/**
	 * @return the standardAdditionTemplate
	 */
	public Optional<String> getStandardAdditionTemplate() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_STANDARD_ADDITION_TEMPLATE);
	}
	/**
	 * @param standardAdditionTemplate the standardAdditionTemplate to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public LicenseAddition setStandardAdditionTemplate(@Nullable String standardAdditionTemplate) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_STANDARD_ADDITION_TEMPLATE, standardAdditionTemplate);
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
			Optional<Boolean> isDeprecatedAdditionId = getIsDeprecatedAdditionId();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting isDeprecatedAdditionId for LicenseAddition: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> obsoletedBy = getObsoletedBy();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting obsoletedBy for LicenseAddition: "+e.getMessage());
		}
		try {
			String additionText = getAdditionText();
			if (Objects.isNull(additionText) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.EXPANDED_LICENSING }))) {
				retval.add("Missing additionText in LicenseAddition");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting additionText for LicenseAddition: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> licenseXml = getLicenseXml();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting licenseXml for LicenseAddition: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> standardAdditionTemplate = getStandardAdditionTemplate();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting standardAdditionTemplate for LicenseAddition: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static abstract class LicenseAdditionBuilder extends ElementBuilder {
	
		/**
		 * Create an LicenseAdditionBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public LicenseAdditionBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an LicenseAdditionBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public LicenseAdditionBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a LicenseAdditionBuilder
		 * @param modelStore model store for the built LicenseAddition
		 * @param objectUri objectUri for the built LicenseAddition
		 * @param copyManager optional copyManager for the built LicenseAddition
		 */
		public LicenseAdditionBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Collection<String> seeAlsos = new ArrayList<>();
		protected Boolean isDeprecatedAdditionId = null;
		protected String obsoletedBy = null;
		protected String additionText = null;
		protected String licenseXml = null;
		protected String standardAdditionTemplate = null;
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder addExtension(Extension extension) {
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
		public LicenseAdditionBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public LicenseAdditionBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public LicenseAdditionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
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
		public LicenseAdditionBuilder addExternalRef(ExternalRef externalRef) {
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
		public LicenseAdditionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public LicenseAdditionBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public LicenseAdditionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				super.externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Adds a seeAlso to the initial collection
		 * @parameter seeAlso seeAlso to add
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder addSeeAlso(String seeAlso) {
			if (Objects.nonNull(seeAlso)) {
				seeAlsos.add(seeAlso);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial seeAlso collection
		 * @parameter seeAlsoCollection collection to initialize the seeAlso
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder addAllSeeAlso(Collection<String> seeAlsoCollection) {
			if (Objects.nonNull(seeAlsoCollection)) {
				seeAlsos.addAll(seeAlsoCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of isDeprecatedAdditionId
		 * @parameter isDeprecatedAdditionId value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setIsDeprecatedAdditionId(Boolean isDeprecatedAdditionId) {
			this.isDeprecatedAdditionId = isDeprecatedAdditionId;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of obsoletedBy
		 * @parameter obsoletedBy value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setObsoletedBy(String obsoletedBy) {
			this.obsoletedBy = obsoletedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of additionText
		 * @parameter additionText value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setAdditionText(String additionText) {
			this.additionText = additionText;
			return this;
		}
		
		/**
		 * Sets the initial value of licenseXml
		 * @parameter licenseXml value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setLicenseXml(String licenseXml) {
			this.licenseXml = licenseXml;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of standardAdditionTemplate
		 * @parameter standardAdditionTemplate value to set
		 * @return this for chaining
		**/
		public LicenseAdditionBuilder setStandardAdditionTemplate(String standardAdditionTemplate) {
			this.standardAdditionTemplate = standardAdditionTemplate;
			return this;
		}
	
		/**
		 * @return the LicenseAddition
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public abstract LicenseAddition build() throws InvalidSPDXAnalysisException;
	}
}
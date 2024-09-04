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
 * A license addition that is not listed on the SPDX Exceptions List. 
 */
public  class CustomLicenseAddition extends LicenseAddition  {

	
	/**
	 * Create the CustomLicenseAddition with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	public CustomLicenseAddition() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the CustomLicenseAddition
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	public CustomLicenseAddition(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the CustomLicenseAddition is to be stored
	 * @param objectUri URI or anonymous ID for the CustomLicenseAddition
	 * @param copyManager Copy manager for the CustomLicenseAddition - can be null if copying is not required
	 * @param create true if CustomLicenseAddition is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	 @SuppressWarnings("unchecked")
	public CustomLicenseAddition(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the CustomLicenseAddition from the builder - used in the builder class
	 * @param builder Builder to create the CustomLicenseAddition from
	 * @throws InvalidSPDXAnalysisException when unable to create the CustomLicenseAddition
	 */
	 @SuppressWarnings("unchecked")
	protected CustomLicenseAddition(CustomLicenseAdditionBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "ExpandedLicensing.CustomLicenseAddition";
	}
	
	// Getters and Setters
	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param isDeprecatedAdditionId the isDeprecatedAdditionId to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public CustomLicenseAddition setIsDeprecatedAdditionId(@Nullable Boolean isDeprecatedAdditionId) throws InvalidSPDXAnalysisException {
		super.setIsDeprecatedAdditionId(isDeprecatedAdditionId);
		return this;
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param obsoletedBy the obsoletedBy to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setObsoletedBy(@Nullable String obsoletedBy) throws InvalidSPDXAnalysisException {
		super.setObsoletedBy(obsoletedBy);
		return this;
	}	
	/**
	 * @param additionText the additionText to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setAdditionText(@Nullable String additionText) throws InvalidSPDXAnalysisException {
		super.setAdditionText(additionText);
		return this;
	}	
	/**
	 * @param licenseXml the licenseXml to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setLicenseXml(@Nullable String licenseXml) throws InvalidSPDXAnalysisException {
		super.setLicenseXml(licenseXml);
		return this;
	}	
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		super.setName(name);
		return this;
	}	
	/**
	 * @param standardAdditionTemplate the standardAdditionTemplate to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public CustomLicenseAddition setStandardAdditionTemplate(@Nullable String standardAdditionTemplate) throws InvalidSPDXAnalysisException {
		super.setStandardAdditionTemplate(standardAdditionTemplate);
		return this;
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
		List<String> retval = new ArrayList<>();
		retval.addAll(super._verify(verifiedIds, specVersionForVerify, profiles));
		return retval;
	}
	
	
	
	public static class CustomLicenseAdditionBuilder extends LicenseAdditionBuilder {
	
		/**
		 * Create an CustomLicenseAdditionBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public CustomLicenseAdditionBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an CustomLicenseAdditionBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public CustomLicenseAdditionBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a CustomLicenseAdditionBuilder
		 * @param modelStore model store for the built CustomLicenseAddition
		 * @param objectUri objectUri for the built CustomLicenseAddition
		 * @param copyManager optional copyManager for the built CustomLicenseAddition
		 */
		public CustomLicenseAdditionBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder addExtension(Extension extension) {
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
		public CustomLicenseAdditionBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public CustomLicenseAdditionBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public CustomLicenseAdditionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
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
		public CustomLicenseAdditionBuilder addExternalRef(ExternalRef externalRef) {
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
		public CustomLicenseAdditionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
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
		public CustomLicenseAdditionBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public CustomLicenseAdditionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
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
		public CustomLicenseAdditionBuilder addSeeAlso(String seeAlso) {
			if (Objects.nonNull(seeAlso)) {
				super.seeAlsos.add(seeAlso);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial seeAlso collection
		 * @parameter seeAlsoCollection collection to initialize the seeAlso
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder addAllSeeAlso(Collection<String> seeAlsoCollection) {
			if (Objects.nonNull(seeAlsoCollection)) {
				super.seeAlsos.addAll(seeAlsoCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of isDeprecatedAdditionId
		 * @parameter isDeprecatedAdditionId value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setIsDeprecatedAdditionId(Boolean isDeprecatedAdditionId) {
			super.isDeprecatedAdditionId = isDeprecatedAdditionId;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of obsoletedBy
		 * @parameter obsoletedBy value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setObsoletedBy(String obsoletedBy) {
			super.obsoletedBy = obsoletedBy;
			return this;
		}
		
		/**
		 * Sets the initial value of additionText
		 * @parameter additionText value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setAdditionText(String additionText) {
			super.additionText = additionText;
			return this;
		}
		
		/**
		 * Sets the initial value of licenseXml
		 * @parameter licenseXml value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setLicenseXml(String licenseXml) {
			super.licenseXml = licenseXml;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setName(String name) {
			super.name = name;
			return this;
		}
		
		/**
		 * Sets the initial value of standardAdditionTemplate
		 * @parameter standardAdditionTemplate value to set
		 * @return this for chaining
		**/
		public CustomLicenseAdditionBuilder setStandardAdditionTemplate(String standardAdditionTemplate) {
			super.standardAdditionTemplate = standardAdditionTemplate;
			return this;
		}
	
		/**
		 * @return the CustomLicenseAddition
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public CustomLicenseAddition build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new CustomLicenseAddition(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}
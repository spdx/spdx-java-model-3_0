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
 
package org.spdx.library.model.v3_0_1.simplelicensing;

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
 * Abstract class representing a license combination consisting of one or more licenses. 
 */
public abstract class AnyLicenseInfo extends Element  {

	
	/**
	 * Create the AnyLicenseInfo with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the AnyLicenseInfo
	 */
	public AnyLicenseInfo() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the AnyLicenseInfo
	 * @throws InvalidSPDXAnalysisException when unable to create the AnyLicenseInfo
	 */
	public AnyLicenseInfo(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the AnyLicenseInfo is to be stored
	 * @param objectUri URI or anonymous ID for the AnyLicenseInfo
	 * @param copyManager Copy manager for the AnyLicenseInfo - can be null if copying is not required
	 * @param create true if AnyLicenseInfo is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the AnyLicenseInfo
	 */
	 @SuppressWarnings("unchecked")
	public AnyLicenseInfo(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the AnyLicenseInfo from the builder - used in the builder class
	 * @param builder Builder to create the AnyLicenseInfo from
	 * @throws InvalidSPDXAnalysisException when unable to create the AnyLicenseInfo
	 */
	 @SuppressWarnings("unchecked")
	protected AnyLicenseInfo(AnyLicenseInfoBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "SimpleLicensing.AnyLicenseInfo";
	}
	
	// Getters and Setters
	
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public AnyLicenseInfo setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		super.setCreationInfo(creationInfo);
		return this;
	}	
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public AnyLicenseInfo setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		super.setSummary(summary);
		return this;
	}	
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public AnyLicenseInfo setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		super.setDescription(description);
		return this;
	}	
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public AnyLicenseInfo setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public AnyLicenseInfo setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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
		return retval;
	}
	
	
	
	public static abstract class AnyLicenseInfoBuilder extends ElementBuilder {
	
		/**
		 * Create an AnyLicenseInfoBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public AnyLicenseInfoBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an AnyLicenseInfoBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public AnyLicenseInfoBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a AnyLicenseInfoBuilder
		 * @param modelStore model store for the built AnyLicenseInfo
		 * @param objectUri objectUri for the built AnyLicenseInfo
		 * @param copyManager optional copyManager for the built AnyLicenseInfo
		 */
		public AnyLicenseInfoBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder addExternalRef(ExternalRef externalRef) {
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
		public AnyLicenseInfoBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
			if (Objects.nonNull(externalRefCollection)) {
				super.externalRefs.addAll(externalRefCollection);
			}
			return this;
		}
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder addExtension(Extension extension) {
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
		public AnyLicenseInfoBuilder addAllExtension(Collection<Extension> extensionCollection) {
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
		public AnyLicenseInfoBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
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
		public AnyLicenseInfoBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
			if (Objects.nonNull(verifiedUsingCollection)) {
				super.verifiedUsings.addAll(verifiedUsingCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalIdentifier to the initial collection
		 * @parameter externalIdentifier externalIdentifier to add
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
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
		public AnyLicenseInfoBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				super.externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder setCreationInfo(CreationInfo creationInfo) {
			super.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder setSummary(String summary) {
			super.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder setDescription(String description) {
			super.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public AnyLicenseInfoBuilder setName(String name) {
			super.name = name;
			return this;
		}
	
		/**
		 * @return the AnyLicenseInfo
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public abstract AnyLicenseInfo build() throws InvalidSPDXAnalysisException;
	}
}

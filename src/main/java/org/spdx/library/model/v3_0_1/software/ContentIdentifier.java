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
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * A canonical, unique, immutable identifier 
 */
public  class ContentIdentifier extends IntegrityMethod  {

	
	/**
	 * Create the ContentIdentifier with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the ContentIdentifier
	 */
	public ContentIdentifier() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the ContentIdentifier
	 * @throws InvalidSPDXAnalysisException when unable to create the ContentIdentifier
	 */
	public ContentIdentifier(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the ContentIdentifier is to be stored
	 * @param objectUri URI or anonymous ID for the ContentIdentifier
	 * @param copyManager Copy manager for the ContentIdentifier - can be null if copying is not required
	 * @param create true if ContentIdentifier is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the ContentIdentifier
	 */
	public ContentIdentifier(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the ContentIdentifier from the builder - used in the builder class
	 * @param builder Builder to create the ContentIdentifier from
	 * @throws InvalidSPDXAnalysisException when unable to create the ContentIdentifier
	 */
	protected ContentIdentifier(ContentIdentifierBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		if (Objects.nonNull(builder.contentIdentifierType)) {
			setContentIdentifierType(builder.contentIdentifierType);
		}
		if (Objects.nonNull(builder.contentIdentifierValue)) {
			setContentIdentifierValue(builder.contentIdentifierValue);
		}
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Software.ContentIdentifier";
	}
	
	// Getters and Setters
	
	/**
	 * @return the contentIdentifierType
	 */
	public @Nullable ContentIdentifierType getContentIdentifierType() throws InvalidSPDXAnalysisException {
		Optional<Enum<?>> retval = getEnumPropertyValue(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER_TYPE);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof ContentIdentifierType)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for contentIdentifierType");
			}
			return (ContentIdentifierType)(retval.get());
		} else {
			return null;
		}
	}
	/**
	 * @param contentIdentifierType the contentIdentifierType to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ContentIdentifier setContentIdentifierType(@Nullable ContentIdentifierType contentIdentifierType) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(contentIdentifierType)) {
			throw new InvalidSPDXAnalysisException("contentIdentifierType is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER_TYPE, contentIdentifierType);
		return this;
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	 @Override
	public ContentIdentifier setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		super.setComment(comment);
		return this;
	}	
	/**
	 * @return the contentIdentifierValue
	 */
	public @Nullable String getContentIdentifierValue() throws InvalidSPDXAnalysisException {
		Optional<String> retval = getStringPropertyValue(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER_VALUE);
		return retval.isPresent() ? retval.get() : null;
	}
		/**
	 * @param contentIdentifierValue the contentIdentifierValue to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ContentIdentifier setContentIdentifierValue(@Nullable String contentIdentifierValue) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(contentIdentifierValue)) {
			throw new InvalidSPDXAnalysisException("contentIdentifierValue is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_CONTENT_IDENTIFIER_VALUE, contentIdentifierValue);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "ContentIdentifier: "+getObjectUri();
		
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		retval.addAll(super._verify(verifiedIds, specVersionForVerify, profiles));
		try {
			ContentIdentifierType contentIdentifierType = getContentIdentifierType();
			if (Objects.isNull(contentIdentifierType) && 
						Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SOFTWARE }))) {
				retval.add("Missing contentIdentifierType in ContentIdentifier");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting contentIdentifierType for ContentIdentifier: "+e.getMessage());
		}
		try {
			String contentIdentifierValue = getContentIdentifierValue();
			if (Objects.isNull(contentIdentifierValue) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.SOFTWARE }))) {
				retval.add("Missing contentIdentifierValue in ContentIdentifier");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting contentIdentifierValue for ContentIdentifier: "+e.getMessage());
		}
		return retval;
	}
	
	
	
	public static class ContentIdentifierBuilder extends IntegrityMethodBuilder {
	
		/**
		 * Create an ContentIdentifierBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public ContentIdentifierBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an ContentIdentifierBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public ContentIdentifierBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
			setIdPrefix(from.getIdPrefix());
		}
		
		/**
		 * Creates a ContentIdentifierBuilder
		 * @param modelStore model store for the built ContentIdentifier
		 * @param objectUri objectUri for the built ContentIdentifier
		 * @param copyManager optional copyManager for the built ContentIdentifier
		 */
		public ContentIdentifierBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected ContentIdentifierType contentIdentifierType = null;
		protected String contentIdentifierValue = null;
		
		
		/**
		 * Sets the initial value of contentIdentifierType
		 * @parameter contentIdentifierType value to set
		 * @return this for chaining
		**/
		public ContentIdentifierBuilder setContentIdentifierType(ContentIdentifierType contentIdentifierType) {
			this.contentIdentifierType = contentIdentifierType;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public ContentIdentifierBuilder setComment(String comment) {
			super.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of contentIdentifierValue
		 * @parameter contentIdentifierValue value to set
		 * @return this for chaining
		**/
		public ContentIdentifierBuilder setContentIdentifierValue(String contentIdentifierValue) {
			this.contentIdentifierValue = contentIdentifierValue;
			return this;
		}
	
		/**
		 * @return the ContentIdentifier
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public ContentIdentifier build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = getModelStore().enterCriticalSection(false);
			try {
				return new ContentIdentifier(this);
			} finally {
				getModelStore().leaveCriticalSection(lock);
			}
		}
	}
}

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
 
package org.spdx.library.model.v3_0_1.core;

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
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * Base domain class from which all other SPDX-3.0 domain classes derive. 
 */
public abstract class Element extends ModelObjectV3  {

	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	
	/**
	 * Create the Element with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the Element
	 */
	public Element() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous));
	}

	/**
	 * @param objectUri URI or anonymous ID for the Element
	 * @throws InvalidSPDXAnalysisException when unable to create the Element
	 */
	public Element(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), 
				true, DefaultModelStore.getDefaultDocumentUri() + "#");
	}

	/**
	 * @param modelStore Model store where the Element is to be stored
	 * @param objectUri URI or anonymous ID for the Element
	 * @param copyManager Copy manager for the Element - can be null if copying is not required
	 * @param create true if Element is to be created
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException when unable to create the Element
	 */
	 @SuppressWarnings("unchecked")
	public Element(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, idPrefix);
		if (!isExternal()) {
			externalRefs = (Collection<ExternalRef>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTERNAL_REF, ExternalRef.class);
		}
		if (!isExternal()) {
			extensions = (Collection<Extension>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTENSION, Extension.class);
		}
		if (!isExternal()) {
			verifiedUsings = (Collection<IntegrityMethod>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_VERIFIED_USING, IntegrityMethod.class);
		}
		if (!isExternal()) {
			externalIdentifiers = (Collection<ExternalIdentifier>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTERNAL_IDENTIFIER, ExternalIdentifier.class);
		}
	}

	/**
	 * Create the Element from the builder - used in the builder class
	 * @param builder Builder to create the Element from
	 * @throws InvalidSPDXAnalysisException when unable to create the Element
	 */
	 @SuppressWarnings("unchecked")
	protected Element(ElementBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		externalRefs = (Collection<ExternalRef>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTERNAL_REF, ExternalRef.class);
		extensions = (Collection<Extension>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTENSION, Extension.class);
		verifiedUsings = (Collection<IntegrityMethod>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_VERIFIED_USING, IntegrityMethod.class);
		externalIdentifiers = (Collection<ExternalIdentifier>)(Collection<?>)this.getObjectPropertyValueCollection(SpdxConstantsV3.PROP_EXTERNAL_IDENTIFIER, ExternalIdentifier.class);
		getExternalRefs().addAll(builder.externalRefs);
		getExtensions().addAll(builder.extensions);
		getVerifiedUsings().addAll(builder.verifiedUsings);
		getExternalIdentifiers().addAll(builder.externalIdentifiers);
		if (Objects.nonNull(builder.creationInfo)) {
			setCreationInfo(builder.creationInfo);
		}
		setSummary(builder.summary);
		setDescription(builder.description);
		setComment(builder.comment);
		setName(builder.name);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.Element";
	}
	
	// Getters and Setters
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	
	/**
	 * @return the creationInfo
	 */
	 @SuppressWarnings("unchecked")
	public @Nullable CreationInfo getCreationInfo() throws InvalidSPDXAnalysisException {
		Optional<Object> retval = getObjectPropertyValue(SpdxConstantsV3.PROP_CREATION_INFO);
		if (retval.isPresent()) {
			if (!(retval.get() instanceof CreationInfo)) {
				throw new InvalidSPDXAnalysisException("Incorrect type stored for creationInfo");
			}
			return (CreationInfo)(retval.get());
		} else {
			return null;
		}
	}
		
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Element setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(creationInfo)) {
			throw new InvalidSPDXAnalysisException("creationInfo is a required property");
		}
		setPropertyValue(SpdxConstantsV3.PROP_CREATION_INFO, creationInfo);
		return this;
	}
		/**
	 * @return the summary
	 */
	public Optional<String> getSummary() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_SUMMARY);
	}
	/**
	 * @param summary the summary to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Element setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_SUMMARY, summary);
		return this;
	}
		/**
	 * @return the description
	 */
	public Optional<String> getDescription() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_DESCRIPTION);
	}
	/**
	 * @param description the description to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Element setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_DESCRIPTION, description);
		return this;
	}
		/**
	 * @return the comment
	 */
	public Optional<String> getComment() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_COMMENT);
	}
	/**
	 * @param comment the comment to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Element setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_COMMENT, comment);
		return this;
	}
		/**
	 * @return the name
	 */
	public Optional<String> getName() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstantsV3.PROP_NAME);
	}
	/**
	 * @param name the name to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Element setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstantsV3.PROP_NAME, name);
		return this;
	}
	
	
	@Override
	public String toString() {
		try {
			StringBuilder sb = new StringBuilder();
			Optional<String> name = getName();
			if (name.isPresent()) {
				sb.append(name.get());
			} else {
				sb.append("[Name Missing]");
			}
			sb.append(":");
			sb.append(getType());
			sb.append('(');
			sb.append(getObjectUri());
			sb.append(')');
			return sb.toString();
		} catch (InvalidSPDXAnalysisException e) {
			return "Error: "+e.getMessage();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		List<String> retval = new ArrayList<>();
		CreationInfo creationInfo;
		try {
			creationInfo = getCreationInfo();
			if (Objects.nonNull(creationInfo)) {
				retval.addAll(creationInfo.verify(verifiedIds, specVersionForVerify, profiles));
			} else if (!Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
					retval.add("Missing creationInfo in Element");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting creationInfo for Element: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> summary = getSummary();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting summary for Element: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> description = getDescription();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting description for Element: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> comment = getComment();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting comment for Element: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> name = getName();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting name for Element: "+e.getMessage());
		}
		for (ExternalRef externalRef:externalRefs) {
			retval.addAll(externalRef.verify(verifiedIds, specVersionForVerify, profiles));
		}
		for (Extension extension:extensions) {
			retval.addAll(extension.verify(verifiedIds, specVersionForVerify, profiles));
		}
		for (IntegrityMethod verifiedUsing:verifiedUsings) {
			retval.addAll(verifiedUsing.verify(verifiedIds, specVersionForVerify, profiles));
		}
		for (ExternalIdentifier externalIdentifier:externalIdentifiers) {
			retval.addAll(externalIdentifier.verify(verifiedIds, specVersionForVerify, profiles));
		}
		return retval;
	}
	
	
	
	public static abstract class ElementBuilder extends ModelObjectV3Builder {
	
		/**
		 * Create an ElementBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public ElementBuilder(ModelObjectV3 from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous));
		}
	
		/**
		 * Create an ElementBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @throws InvalidSPDXAnalysisException if creationInfo can not be fetched from the from
		 */
		public ElementBuilder(ModelObjectV3 from, String objectUri) throws InvalidSPDXAnalysisException {
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
		 * Creates a ElementBuilder
		 * @param modelStore model store for the built Element
		 * @param objectUri objectUri for the built Element
		 * @param copyManager optional copyManager for the built Element
		 */
		public ElementBuilder(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		protected Collection<ExternalRef> externalRefs = new ArrayList<>();
		protected Collection<Extension> extensions = new ArrayList<>();
		protected Collection<IntegrityMethod> verifiedUsings = new ArrayList<>();
		protected Collection<ExternalIdentifier> externalIdentifiers = new ArrayList<>();
		protected CreationInfo creationInfo = null;
		protected String summary = null;
		protected String description = null;
		protected String comment = null;
		protected String name = null;
		
		
		/**
		 * Adds a externalRef to the initial collection
		 * @parameter externalRef externalRef to add
		 * @return this for chaining
		**/
		public ElementBuilder addExternalRef(ExternalRef externalRef) {
			if (Objects.nonNull(externalRef)) {
				externalRefs.add(externalRef);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial externalRef collection
		 * @parameter externalRefCollection collection to initialize the externalRef
		 * @return this for chaining
		**/
		public ElementBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
			if (Objects.nonNull(externalRefCollection)) {
				externalRefs.addAll(externalRefCollection);
			}
			return this;
		}
		
		/**
		 * Adds a extension to the initial collection
		 * @parameter extension extension to add
		 * @return this for chaining
		**/
		public ElementBuilder addExtension(Extension extension) {
			if (Objects.nonNull(extension)) {
				extensions.add(extension);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial extension collection
		 * @parameter extensionCollection collection to initialize the extension
		 * @return this for chaining
		**/
		public ElementBuilder addAllExtension(Collection<Extension> extensionCollection) {
			if (Objects.nonNull(extensionCollection)) {
				extensions.addAll(extensionCollection);
			}
			return this;
		}
		
		/**
		 * Adds a verifiedUsing to the initial collection
		 * @parameter verifiedUsing verifiedUsing to add
		 * @return this for chaining
		**/
		public ElementBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
			if (Objects.nonNull(verifiedUsing)) {
				verifiedUsings.add(verifiedUsing);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial verifiedUsing collection
		 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
		 * @return this for chaining
		**/
		public ElementBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
			if (Objects.nonNull(verifiedUsingCollection)) {
				verifiedUsings.addAll(verifiedUsingCollection);
			}
			return this;
		}
		
		/**
		 * Adds a externalIdentifier to the initial collection
		 * @parameter externalIdentifier externalIdentifier to add
		 * @return this for chaining
		**/
		public ElementBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
			if (Objects.nonNull(externalIdentifier)) {
				externalIdentifiers.add(externalIdentifier);
			}
			return this;
		}
		
		/**
		 * Adds all elements from a collection to the initial externalIdentifier collection
		 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
		 * @return this for chaining
		**/
		public ElementBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
			if (Objects.nonNull(externalIdentifierCollection)) {
				externalIdentifiers.addAll(externalIdentifierCollection);
			}
			return this;
		}
		
		/**
		 * Sets the initial value of creationInfo
		 * @parameter creationInfo value to set
		 * @return this for chaining
		**/
		public ElementBuilder setCreationInfo(CreationInfo creationInfo) {
			this.creationInfo = creationInfo;
			return this;
		}
		
		/**
		 * Sets the initial value of summary
		 * @parameter summary value to set
		 * @return this for chaining
		**/
		public ElementBuilder setSummary(String summary) {
			this.summary = summary;
			return this;
		}
		
		/**
		 * Sets the initial value of description
		 * @parameter description value to set
		 * @return this for chaining
		**/
		public ElementBuilder setDescription(String description) {
			this.description = description;
			return this;
		}
		
		/**
		 * Sets the initial value of comment
		 * @parameter comment value to set
		 * @return this for chaining
		**/
		public ElementBuilder setComment(String comment) {
			this.comment = comment;
			return this;
		}
		
		/**
		 * Sets the initial value of name
		 * @parameter name value to set
		 * @return this for chaining
		**/
		public ElementBuilder setName(String name) {
			this.name = name;
			return this;
		}
	
		/**
		 * @return the Element
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public abstract Element build() throws InvalidSPDXAnalysisException;
	}
}
/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
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
import org.spdx.storage.NullModelStore;

/**
 * An Individual Value for Element representing a set of Elements of unknown identify 
 * or cardinality (number). 
 */
public class NoAssertionElement extends IndividualElement implements IndividualUriValue {

	/**
	 * @throws InvalidSPDXAnalysisException when unable to create the NoAssertionElement
	 */
	public NoAssertionElement() throws InvalidSPDXAnalysisException {
		super(new NullModelStore(), "https://spdx.org/rdf/3.0.1/terms/Core/NoAssertionElement", null, true, null);
	}
	
	@Override
	public boolean isExternal() {
		return true;  // since it is not technically stored in the model store
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.core.CoreModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.NoAssertionElement";
	}
	
	// Getters and Setters
	public Collection<ExternalRef> getExternalRefs() {
		return new ArrayList<ExternalRef>();
	}
	public Collection<Extension> getExtensions() {
		return new ArrayList<Extension>();
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return new ArrayList<IntegrityMethod>();
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return new ArrayList<ExternalIdentifier>();
	}
	
	/**
	 * @return the creationInfo
	 */
	 @SuppressWarnings("unchecked")
	public @Nullable CreationInfo getCreationInfo() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param creationInfo the creationInfo to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public NoAssertionElement setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("Can not set or modify a property of an Individual type");
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
	public NoAssertionElement setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("Can not set or modify a property of an Individual type");
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
	public NoAssertionElement setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("Can not set or modify a property of an Individual type");
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
	public NoAssertionElement setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("Can not set or modify a property of an Individual type");
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
	public NoAssertionElement setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("Can not set or modify a property of an Individual type");
	}
	
	@Override
	public String toString() {
		return "NOASSERTION";
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		return new ArrayList<>();
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof NoAssertionElement;
	}
	
	@Override
	public int hashCode() {
		return "https://spdx.org/rdf/3.0.1/terms/Core/NoAssertionElement".hashCode();
	}
	
	@Override
	public String getIndividualURI() {
		return "https://spdx.org/rdf/3.0.1/terms/Core/NoAssertionElement";
	}
}

/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.operations;

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
import org.spdx.library.model.v3.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.Bundle;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.extension.Extension;

/**
 * This is an external representation of Project - nothing can be set and properties returned
 * are not valid
 *
 */
public class ExternalProject extends Project  implements IndividualUriValue {

	Collection<Element> rootElements = Collections.emptyList();
	Collection<Agent> projectSponsors = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<Element> elements = Collections.emptyList();
	Collection<ProfileIdentifierType> profileConformances = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the Project
	 * @throws InvalidSPDXAnalysisException when unable to create the Project
	 */
	public ExternalProject(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalProject
	 */
	public ExternalProject(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the Project from the builder - used in the builder class
	 * @param builder Builder to create the Project from
	 * @throws InvalidSPDXAnalysisException when unable to create the Project
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalProject(ProjectBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "Operations.ExternalProject";
	}
	
	// Getters and Setters
	public Collection<Element> getRootElements() {
		return rootElements;
	}
	public Collection<Agent> getProjectSponsors() {
		return projectSponsors;
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
	public Collection<Element> getElements() {
		return elements;
	}
	public Collection<ProfileIdentifierType> getProfileConformances() {
		return profileConformances;
	}
	
	/**
	 * @return the projectOwner
	 */
	public @Nullable Agent getProjectOwner() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param projectOwner the projectOwner to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setProjectOwner(@Nullable Agent projectOwner) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the extension
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Extension> getExtension() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param extension the extension to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setExtension(@Nullable Extension extension) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
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
	public Project setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
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
	public Project setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the projectStartTime
	 */
	public @Nullable String getProjectStartTime() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param projectStartTime the projectStartTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setProjectStartTime(@Nullable String projectStartTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the projectEndTime
	 */
	public Optional<String> getProjectEndTime() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param projectEndTime the projectEndTime to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setProjectEndTime(@Nullable String projectEndTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the projectTitle
	 */
	public @Nullable String getProjectTitle() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param projectTitle the projectTitle to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setProjectTitle(@Nullable String projectTitle) throws InvalidSPDXAnalysisException {
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
	public Project setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the context
	 */
	public Optional<String> getContext() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param context the context to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setContext(@Nullable String context) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the projectContract
	 */
	public @Nullable String getProjectContract() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param projectContract the projectContract to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public Project setProjectContract(@Nullable String projectContract) throws InvalidSPDXAnalysisException {
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
	public Project setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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
	public Project setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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

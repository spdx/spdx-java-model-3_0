/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.supplychain;

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
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DefinedProcess;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;

/**
 * This is an external representation of ResponsibilityChangeProcess - nothing can be set and properties returned
 * are not valid
 *
 */
public class ExternalResponsibilityChangeProcess extends ResponsibilityChangeProcess  implements IndividualUriValue {

	Collection<Element> plannedProductOfResponsibilityChanges = Collections.emptyList();
	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<Agent> originatedBys = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<String> standardNames = Collections.emptyList();
	Collection<SupportType> supportLevels = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the ResponsibilityChangeProcess
	 * @throws InvalidSPDXAnalysisException when unable to create the ResponsibilityChangeProcess
	 */
	public ExternalResponsibilityChangeProcess(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalResponsibilityChangeProcess
	 */
	public ExternalResponsibilityChangeProcess(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, SpdxConstantsV3.MODEL_SPEC_VERSION, idPrefix);
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param specVersion Version of the SPDX specification
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalResponsibilityChangeProcess
	 */
	public ExternalResponsibilityChangeProcess(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String specVersion, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, specVersion, idPrefix);
	}

	/**
	 * Create the ResponsibilityChangeProcess from the builder - used in the builder class
	 * @param builder Builder to create the ResponsibilityChangeProcess from
	 * @throws InvalidSPDXAnalysisException when unable to create the ResponsibilityChangeProcess
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalResponsibilityChangeProcess(ResponsibilityChangeProcessBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "SupplyChain.ExternalResponsibilityChangeProcess";
	}
	
	// Getters and Setters
	public Collection<Element> getPlannedProductOfResponsibilityChanges() {
		return plannedProductOfResponsibilityChanges;
	}
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<IntegrityMethod> getVerifiedUsings() {
		return verifiedUsings;
	}
	public Collection<Agent> getOriginatedBys() {
		return originatedBys;
	}
	public Collection<ExternalIdentifier> getExternalIdentifiers() {
		return externalIdentifiers;
	}
	public Collection<Extension> getExtensions() {
		return extensions;
	}
	public Collection<SupportType> getSupportLevels() {
		return supportLevels;
	}
	public Collection<String> getStandardNames() {
		return standardNames;
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
	public ResponsibilityChangeProcess setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the plannedPrevious
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Agent> getPlannedPrevious() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param plannedPrevious the plannedPrevious to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setPlannedPrevious(@Nullable Agent plannedPrevious) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the plannedCurrent
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Agent> getPlannedCurrent() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param plannedCurrent the plannedCurrent to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setPlannedCurrent(@Nullable Agent plannedCurrent) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the processReadiness
	 */
	 @SuppressWarnings("unchecked")
	public Optional<ProcessReadinessType> getProcessReadiness() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param processReadiness the processReadiness to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setProcessReadiness(@Nullable ProcessReadinessType processReadiness) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the responsibilityCategory
	 */
	public @Nullable ResponsibilityType getResponsibilityCategory() throws InvalidSPDXAnalysisException {
		return null;
	}
	/**
	 * @param responsibilityCategory the responsibilityCategory to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setResponsibilityCategory(@Nullable ResponsibilityType responsibilityCategory) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the intendedUse
	 */
	public Optional<String> getIntendedUse() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param intendedUse the intendedUse to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setIntendedUse(@Nullable String intendedUse) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the processVersion
	 */
	public @Nullable String getProcessVersion() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param processVersion the processVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setProcessVersion(@Nullable String processVersion) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setName(@Nullable String name) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the processRationale
	 */
	public Optional<String> getProcessRationale() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param processRationale the processRationale to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public ResponsibilityChangeProcess setProcessRationale(@Nullable String processRationale) throws InvalidSPDXAnalysisException {
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
	public ResponsibilityChangeProcess setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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

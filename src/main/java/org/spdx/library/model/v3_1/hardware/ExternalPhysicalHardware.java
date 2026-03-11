/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.hardware;

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
import org.spdx.library.model.v3_1.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.core.Agent;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.DefinedType;
import org.spdx.library.model.v3_1.core.DictionaryEntry;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.MeasureOfMass;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.Specification;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;

/**
 * This is an external representation of PhysicalHardware - nothing can be set and properties returned
 * are not valid
 *
 */
public class ExternalPhysicalHardware extends PhysicalHardware  implements IndividualUriValue {

	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<DictionaryEntry> HardwareAdditionalInformations = Collections.emptyList();
	Collection<Specification> additionalInformationSpecifications = Collections.emptyList();
	Collection<DefinedType> hazards = Collections.emptyList();
	Collection<DefinedType> categorys = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<Agent> originatedBys = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Collection<String> standardNames = Collections.emptyList();
	Collection<SupportType> supportLevels = Collections.emptyList();

	/**
	 * @param objectUri URI or anonymous ID for the PhysicalHardware
	 * @throws InvalidSPDXAnalysisException when unable to create the PhysicalHardware
	 */
	public ExternalPhysicalHardware(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalPhysicalHardware
	 */
	public ExternalPhysicalHardware(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the PhysicalHardware from the builder - used in the builder class
	 * @param builder Builder to create the PhysicalHardware from
	 * @throws InvalidSPDXAnalysisException when unable to create the PhysicalHardware
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalPhysicalHardware(PhysicalHardwareBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "Hardware.ExternalPhysicalHardware";
	}
	
	// Getters and Setters
	public Collection<ExternalRef> getExternalRefs() {
		return externalRefs;
	}
	public Collection<DictionaryEntry> getHardwareAdditionalInformations() {
		return HardwareAdditionalInformations;
	}
	public Collection<Specification> getAdditionalInformationSpecifications() {
		return additionalInformationSpecifications;
	}
	public Collection<DefinedType> getHazards() {
		return hazards;
	}
	public Collection<DefinedType> getCategorys() {
		return categorys;
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
	public Collection<SupportType> getSupportLevels() {
		return supportLevels;
	}
	public Collection<String> getStandardNames() {
		return standardNames;
	}
	
	/**
	 * @return the productAgent
	 */
	public @Nullable Agent getProductAgent() throws InvalidSPDXAnalysisException {
		return null;
	}
		
	/**
	 * @param productAgent the productAgent to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setProductAgent(@Nullable Agent productAgent) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
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
	public PhysicalHardware setSuppliedBy(@Nullable Agent suppliedBy) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the dimensions
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Dimensions> getDimensions() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param dimensions the dimensions to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setDimensions(@Nullable Dimensions dimensions) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the centerOfMass
	 */
	 @SuppressWarnings("unchecked")
	public Optional<Dimensions> getCenterOfMass() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param centerOfMass the centerOfMass to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setCenterOfMass(@Nullable Dimensions centerOfMass) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the massOfHardware
	 */
	 @SuppressWarnings("unchecked")
	public Optional<MeasureOfMass> getMassOfHardware() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	
	/**
	 * @param massOfHardware the massOfHardware to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setMassOfHardware(@Nullable MeasureOfMass massOfHardware) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setExtension(@Nullable Extension extension) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the batchNumber
	 */
	public Optional<String> getBatchNumber() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param batchNumber the batchNumber to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setBatchNumber(@Nullable String batchNumber) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the serialNumber
	 */
	public Optional<String> getSerialNumber() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param serialNumber the serialNumber to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setSerialNumber(@Nullable String serialNumber) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setIntendedUse(@Nullable String intendedUse) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setBuiltTime(@Nullable String builtTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	/**
	 * @return the partNumber
	 */
	public @Nullable String getPartNumber() throws InvalidSPDXAnalysisException {
		return null;
	}
		/**
	 * @param partNumber the partNumber to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setPartNumber(@Nullable String partNumber) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setValidUntilTime(@Nullable String validUntilTime) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the releaseDate
	 */
	public Optional<String> getReleaseDate() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param releaseDate the releaseDate to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setReleaseDate(@Nullable String releaseDate) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
		/**
	 * @return the hardwareVersion
	 */
	public Optional<String> getHardwareVersion() throws InvalidSPDXAnalysisException {
		return Optional.empty();
	}
	/**
	 * @param hardwareVersion the hardwareVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PhysicalHardware setHardwareVersion(@Nullable String hardwareVersion) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setReleaseTime(@Nullable String releaseTime) throws InvalidSPDXAnalysisException {
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
	public PhysicalHardware setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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

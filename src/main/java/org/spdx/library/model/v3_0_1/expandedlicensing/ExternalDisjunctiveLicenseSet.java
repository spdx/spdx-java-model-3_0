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
import java.util.HashSet;
import java.util.Iterator;
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
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * This is an external representation of DisjunctiveLicenseSet - nothing can be set and properties returned
 * are not valid
 *
**/
public class ExternalDisjunctiveLicenseSet extends DisjunctiveLicenseSet  implements IndividualUriValue {

	Collection<ExternalRef> externalRefs = Collections.emptyList();
	Collection<Extension> extensions = Collections.emptyList();
	Collection<IntegrityMethod> verifiedUsings = Collections.emptyList();
	Collection<ExternalIdentifier> externalIdentifiers = Collections.emptyList();
	Set<AnyLicenseInfo> members = Collections.emptySet();

	/**
	 * @param objectUri URI or anonymous ID for the DisjunctiveLicenseSet
	 * @throws InvalidSPDXAnalysisException when unable to create the DisjunctiveLicenseSet
	 */
	public ExternalDisjunctiveLicenseSet(String objectUri) throws InvalidSPDXAnalysisException {
		this(new NullModelStore(), objectUri, null, true, "");
	}

	/**
	 * @param modelStore Generally ignored for external
	 * @param objectUri URI for the external element
	 * @param copyManager Generally ignored for external
	 * @param create Generally ignored for external
	 * @param idPrefix Generally ignored for external
	 * @throws InvalidSPDXAnalysisException when unable to create the ExternalDisjunctiveLicenseSet
	 */
	public ExternalDisjunctiveLicenseSet(IModelStore modelStore, String objectUri, @Nullable IModelCopyManager copyManager,
			boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
	}

	/**
	 * Create the DisjunctiveLicenseSet from the builder - used in the builder class
	 * @param builder Builder to create the DisjunctiveLicenseSet from
	 * @throws InvalidSPDXAnalysisException when unable to create the DisjunctiveLicenseSet
	 */
	 @SuppressWarnings("unchecked")
	protected ExternalDisjunctiveLicenseSet(DisjunctiveLicenseSetBuilder builder) throws InvalidSPDXAnalysisException {
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
		return "ExpandedLicensing.ExternalDisjunctiveLicenseSet";
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
	public Set<AnyLicenseInfo> getMembers() {
		return members;
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
	public DisjunctiveLicenseSet setCreationInfo(@Nullable CreationInfo creationInfo) throws InvalidSPDXAnalysisException {
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
	public DisjunctiveLicenseSet setSummary(@Nullable String summary) throws InvalidSPDXAnalysisException {
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
	public DisjunctiveLicenseSet setDescription(@Nullable String description) throws InvalidSPDXAnalysisException {
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
	public DisjunctiveLicenseSet setComment(@Nullable String comment) throws InvalidSPDXAnalysisException {
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
	public DisjunctiveLicenseSet setName(@Nullable String name) throws InvalidSPDXAnalysisException {
		throw new InvalidSPDXAnalysisException("External elements can not set properties");
	}
	
	
	@Override
	public String toString() {
				StringBuilder sb = new StringBuilder("(");
		boolean moreThanOne = false;
		Iterator<AnyLicenseInfo> iter;
		iter = this.getMembers().iterator();
		while (iter.hasNext()) {
			if (moreThanOne) {
				sb.append(" OR ");
			}
			moreThanOne = true;
			sb.append(iter.next().toString());
		}
		sb.append(')');
		return sb.toString();
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.v3.ModelObjectV3#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<IndividualUriValue> profiles) {
		return new ArrayList<>();
	}
}

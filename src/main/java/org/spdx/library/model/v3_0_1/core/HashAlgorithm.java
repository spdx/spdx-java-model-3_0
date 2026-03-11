/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * A mathematical algorithm that maps data of arbitrary size to a bit string. 
 */
public enum HashAlgorithm implements IndividualUriValue {

	CRYSTALS_KYBER("crystalsKyber"),
	MD6("md6"),
	SHA224("sha224"),
	MD5("md5"),
	SHA3_256("sha3_256"),
	MD4("md4"),
	BLAKE2B512("blake2b512"),
	SHA3_224("sha3_224"),
	CRYSTALS_DILITHIUM("crystalsDilithium"),
	BLAKE2B256("blake2b256"),
	SHA384("sha384"),
	OTHER("other"),
	SHA1("sha1"),
	ADLER32("adler32"),
	BLAKE2B384("blake2b384"),
	SHA3_512("sha3_512"),
	MD2("md2"),
	SHA256("sha256"),
	SHA512("sha512"),
	SHA3_384("sha3_384"),
	BLAKE3("blake3"),
	FALCON("falcon");
	
	private String longName;
	
	private HashAlgorithm(String longName) {
		this.longName = longName;
	}
	
	@Override
	public String getIndividualURI() {
		return getNameSpace() + "/" + getLongName();
	}
	
	public String getLongName() {
		return longName;
	}
	
	public String getNameSpace() {
		return "https://spdx.org/rdf/3.0.1/terms/Core/HashAlgorithm";
	}
}


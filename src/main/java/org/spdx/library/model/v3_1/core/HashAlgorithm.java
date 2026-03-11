/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * A mathematical algorithm that maps data of arbitrary size to a bit string. 
 */
public enum HashAlgorithm implements IndividualUriValue {

	MD2("md2"),
	BLAKE2B256("blake2b256"),
	SHA3_512("sha3_512"),
	BLAKE3("blake3"),
	SHA3_256("sha3_256"),
	SHA256("sha256"),
	BLAKE2B384("blake2b384"),
	SHA224("sha224"),
	SHA3_384("sha3_384"),
	BLAKE2B512("blake2b512"),
	SHA1("sha1"),
	OTHER("other"),
	CRYSTALS_DILITHIUM("crystalsDilithium"),
	CRYSTALS_KYBER("crystalsKyber"),
	MD6("md6"),
	ADLER32("adler32"),
	FALCON("falcon"),
	SHA512("sha512"),
	MD4("md4"),
	SHA3_224("sha3_224"),
	MD5("md5"),
	SHA384("sha384");
	
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
		return "https://spdx.org/rdf/3.1/terms/Core/HashAlgorithm";
	}
}


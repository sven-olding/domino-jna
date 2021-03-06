package com.mindoo.domino.jna.internal.structs.viewformat;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.mindoo.domino.jna.internal.structs.NotesNFMTStruct;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesViewColumnFormat4Struct extends BaseStructure {
	/** VIEW_COLUMN_FORMAT_SIGNATURE4 */
	public short Signature;
	/** C type : NFMT */
	public NotesNFMTStruct NumberFormat;
	/** NPREF_xxx */
	public byte NumSymPref;
	/** NNUMSYM_xxx */
	public byte NumSymFlags;
	public int DecimalSymLength;
	public int MilliSepSymLength;
	public int NegativeSymLength;
	public short MilliGroupSize;
	public int Unused1;
	public int Unused2;
	/** NPREF_xxx */
	public byte CurrencyPref;
	/** NCURFMT_xxx */
	public byte CurrencyType;
	/** NCURFMT_xxx */
	public byte CurrencyFlags;
	public int CurrencySymLength;
	public int ISOCountry;
	public short NumberPreference;
	public byte bUnused;
	public int Unused3;
	public int Unused4;
	public NotesViewColumnFormat4Struct() {
		super();
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesViewColumnFormat4Struct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewColumnFormat4Struct>() {

			@Override
			public NotesViewColumnFormat4Struct run() {
				return new NotesViewColumnFormat4Struct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Signature", "NumberFormat", "NumSymPref", "NumSymFlags", "DecimalSymLength", "MilliSepSymLength", "NegativeSymLength", "MilliGroupSize", "Unused1", "Unused2", "CurrencyPref", "CurrencyType", "CurrencyFlags", "CurrencySymLength", "ISOCountry", "NumberPreference", "bUnused", "Unused3", "Unused4");
	}
	public NotesViewColumnFormat4Struct(Pointer peer) {
		super(peer);
		setAlignType(Structure.ALIGN_NONE);
	}
	
	public static NotesViewColumnFormat4Struct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesViewColumnFormat4Struct>() {

			@Override
			public NotesViewColumnFormat4Struct run() {
				return new NotesViewColumnFormat4Struct(peer);
			}
		});
	}

	public static class ByReference extends NotesViewColumnFormat4Struct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesViewColumnFormat4Struct implements Structure.ByValue {
		
	};
}

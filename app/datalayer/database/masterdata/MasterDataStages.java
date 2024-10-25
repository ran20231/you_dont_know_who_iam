package com.forsale.app.datalayer.database.masterdata;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MasterDataExceptions.kt */
/* loaded from: classes2.dex */
public final class MasterDataStages {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MasterDataStages[] $VALUES;
    private final String stageName;
    public static final MasterDataStages DOWNLOADING = new MasterDataStages("DOWNLOADING", 0, "Downloading Master data");
    public static final MasterDataStages SAVING_FILE = new MasterDataStages("SAVING_FILE", 1, "saving master data file");
    public static final MasterDataStages VERIFYING = new MasterDataStages("VERIFYING", 2, "verifying master data process is done");
    public static final MasterDataStages CLEANING = new MasterDataStages("CLEANING", 3, "cleaning up downloaded master db sqlite");
    public static final MasterDataStages CLEANING_ROOM_DB = new MasterDataStages("CLEANING_ROOM_DB", 4, "cleaning up room db ");

    private static final /* synthetic */ MasterDataStages[] $values() {
        return new MasterDataStages[]{DOWNLOADING, SAVING_FILE, VERIFYING, CLEANING, CLEANING_ROOM_DB};
    }

    static {
        MasterDataStages[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MasterDataStages(String str, int i11, String str2) {
        this.stageName = str2;
    }

    public static a<MasterDataStages> getEntries() {
        return $ENTRIES;
    }

    public static MasterDataStages valueOf(String str) {
        return (MasterDataStages) Enum.valueOf(MasterDataStages.class, str);
    }

    public static MasterDataStages[] values() {
        return (MasterDataStages[]) $VALUES.clone();
    }

    public final String getStageName() {
        return this.stageName;
    }
}

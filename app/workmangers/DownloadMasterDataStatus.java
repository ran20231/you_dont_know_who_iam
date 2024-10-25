package com.forsale.app.workmangers;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadMasterDataStatus.kt */
/* loaded from: classes3.dex */
public final class DownloadMasterDataStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DownloadMasterDataStatus[] $VALUES;
    public static final DownloadMasterDataStatus INIT = new DownloadMasterDataStatus("INIT", 0);
    public static final DownloadMasterDataStatus DOWNLOAD = new DownloadMasterDataStatus("DOWNLOAD", 1);
    public static final DownloadMasterDataStatus SAVE_DB_FILE = new DownloadMasterDataStatus("SAVE_DB_FILE", 2);
    public static final DownloadMasterDataStatus TEMP_DB_TESTED = new DownloadMasterDataStatus("TEMP_DB_TESTED", 3);
    public static final DownloadMasterDataStatus MIGRATE_TEMP_TO_REAL = new DownloadMasterDataStatus("MIGRATE_TEMP_TO_REAL", 4);
    public static final DownloadMasterDataStatus REAL_DB_TESTED = new DownloadMasterDataStatus("REAL_DB_TESTED", 5);
    public static final DownloadMasterDataStatus FAILED_SAVE_DB_FILE = new DownloadMasterDataStatus("FAILED_SAVE_DB_FILE", 6);
    public static final DownloadMasterDataStatus FAILED_MIGRATE_TEMP_TO_REAL = new DownloadMasterDataStatus("FAILED_MIGRATE_TEMP_TO_REAL", 7);
    public static final DownloadMasterDataStatus FAILED = new DownloadMasterDataStatus("FAILED", 8);

    private static final /* synthetic */ DownloadMasterDataStatus[] $values() {
        return new DownloadMasterDataStatus[]{INIT, DOWNLOAD, SAVE_DB_FILE, TEMP_DB_TESTED, MIGRATE_TEMP_TO_REAL, REAL_DB_TESTED, FAILED_SAVE_DB_FILE, FAILED_MIGRATE_TEMP_TO_REAL, FAILED};
    }

    static {
        DownloadMasterDataStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DownloadMasterDataStatus(String str, int i11) {
    }

    public static a<DownloadMasterDataStatus> getEntries() {
        return $ENTRIES;
    }

    public static DownloadMasterDataStatus valueOf(String str) {
        return (DownloadMasterDataStatus) Enum.valueOf(DownloadMasterDataStatus.class, str);
    }

    public static DownloadMasterDataStatus[] values() {
        return (DownloadMasterDataStatus[]) $VALUES.clone();
    }
}

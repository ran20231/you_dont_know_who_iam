package com.forsale.app.ui.bottomsheets.useractions;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportAbuseIntention.kt */
/* loaded from: classes3.dex */
public final class ReportAbuseIntention {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ReportAbuseIntention[] $VALUES;
    public static final ReportAbuseIntention LISTING = new ReportAbuseIntention("LISTING", 0);
    public static final ReportAbuseIntention USER = new ReportAbuseIntention("USER", 1);

    private static final /* synthetic */ ReportAbuseIntention[] $values() {
        return new ReportAbuseIntention[]{LISTING, USER};
    }

    static {
        ReportAbuseIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ReportAbuseIntention(String str, int i11) {
    }

    public static a00.a<ReportAbuseIntention> getEntries() {
        return $ENTRIES;
    }

    public static ReportAbuseIntention valueOf(String str) {
        return (ReportAbuseIntention) Enum.valueOf(ReportAbuseIntention.class, str);
    }

    public static ReportAbuseIntention[] values() {
        return (ReportAbuseIntention[]) $VALUES.clone();
    }
}

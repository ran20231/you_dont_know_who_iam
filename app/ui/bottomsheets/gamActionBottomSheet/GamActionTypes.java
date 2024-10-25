package com.forsale.app.ui.bottomsheets.gamActionBottomSheet;

import kotlin.NoWhenBranchMatchedException;
import t9.q0;
import t9.y0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamActionTypes.kt */
/* loaded from: classes3.dex */
public final class GamActionTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ GamActionTypes[] $VALUES;
    public static final GamActionTypes PHONE = new GamActionTypes("PHONE", 0);
    public static final GamActionTypes MESSAGE = new GamActionTypes("MESSAGE", 1);
    public static final GamActionTypes WHATS_APP = new GamActionTypes("WHATS_APP", 2);
    public static final GamActionTypes WEB = new GamActionTypes("WEB", 3);
    public static final GamActionTypes DEEP_LINK = new GamActionTypes("DEEP_LINK", 4);

    /* compiled from: GamActionTypes.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38103a;

        static {
            int[] iArr = new int[GamActionTypes.values().length];
            try {
                iArr[GamActionTypes.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamActionTypes.WHATS_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GamActionTypes.WEB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GamActionTypes.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GamActionTypes.DEEP_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38103a = iArr;
        }
    }

    private static final /* synthetic */ GamActionTypes[] $values() {
        return new GamActionTypes[]{PHONE, MESSAGE, WHATS_APP, WEB, DEEP_LINK};
    }

    static {
        GamActionTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GamActionTypes(String str, int i11) {
    }

    public static a00.a<GamActionTypes> getEntries() {
        return $ENTRIES;
    }

    public static GamActionTypes valueOf(String str) {
        return (GamActionTypes) Enum.valueOf(GamActionTypes.class, str);
    }

    public static GamActionTypes[] values() {
        return (GamActionTypes[]) $VALUES.clone();
    }

    public final int toActionBG() {
        int i11 = a.f38103a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return q0.f69785p;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return q0.f69773m;
                }
                return q0.f69785p;
            }
            return q0.f69749g;
        }
        return q0.f69745f;
    }

    public final int toActionResource() {
        int i11 = a.f38103a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return q0.f69790q0;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return q0.V1;
                }
                return q0.A2;
            }
            return q0.f69746f0;
        }
        return q0.f69742e0;
    }

    public final int toActionText() {
        int i11 = a.f38103a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return y0.B4;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return y0.f70780z4;
                }
                return y0.B4;
            }
            return y0.D4;
        }
        return y0.f70732w4;
    }

    public final int toTitleText() {
        int i11 = a.f38103a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return y0.f70764y4;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return y0.A4;
                }
                return y0.C4;
            }
            return y0.E4;
        }
        return y0.f70748x4;
    }
}

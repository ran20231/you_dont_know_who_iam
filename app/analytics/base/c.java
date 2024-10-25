package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.b;
import com.forsale.app.analytics.base.d;
import com.forsale.app.analytics.base.g;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.DeviceType;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.UserProperties;
import com.leanplum.core.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticsPropertiesInteractor.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: AnalyticsPropertiesInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21987a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21988b;

        static {
            int[] iArr = new int[Languages.values().length];
            try {
                iArr[Languages.ARABIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Languages.ENGLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21987a = iArr;
            int[] iArr2 = new int[UserStatus.values().length];
            try {
                iArr2[UserStatus.LoggedIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserStatus.NotLoggedIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserStatus.BlockedUser.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserStatus.CompletelyBlocked.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UserStatus.DeletedAccount.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f21988b = iArr2;
        }
    }

    private final List<Pair<UserProperties, Object>> a(d dVar) {
        d.b a11;
        d.c b11;
        ArrayList arrayList = new ArrayList();
        if (dVar != null && (b11 = dVar.b()) != null) {
            arrayList.addAll(e(new b.e(b11)));
        }
        if (dVar != null && (a11 = dVar.a()) != null) {
            DeviceType a12 = a11.a();
            if (a12 != null) {
                arrayList.addAll(b(a12));
            }
            arrayList.addAll(d(a11.c()));
            arrayList.addAll(c(a11.b()));
        }
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> b(DeviceType deviceType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(UserProperties.DEVICE_SIZE, deviceType.getValue()));
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> c(boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(UserProperties.IS_DARK_MODE_ENABLED, Boolean.valueOf(z11)));
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> d(boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(UserProperties.IsEnablePushNotification, Boolean.valueOf(z11)));
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> f(d.c cVar) {
        Integer num;
        String b11;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        UserProperties userProperties = UserProperties.SELECTED_COUNTRY_ID;
        String str = null;
        if (cVar != null) {
            num = Integer.valueOf(cVar.a());
        } else {
            num = null;
        }
        arrayList.add(new Pair(userProperties, String.valueOf(num)));
        if (cVar != null && (b11 = cVar.b()) != null) {
            boolean z12 = false;
            if (b11.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z12 = true;
            }
            if (z12) {
                str = b11;
            }
            if (str != null) {
                arrayList.add(new Pair(UserProperties.SELECTED_COUNTRY, str));
            }
        }
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> g(g.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar != null) {
            aVar.a();
            arrayList.add(new Pair(UserProperties.FREE_CREDITS, String.valueOf(aVar.a())));
        } else {
            arrayList.add(new Pair(UserProperties.FREE_CREDITS, BuildConfig.BUILD_NUMBER));
        }
        if (aVar != null) {
            aVar.b();
            arrayList.add(new Pair(UserProperties.PREMIUM_CREDITS, String.valueOf(aVar.b())));
        } else {
            arrayList.add(new Pair(UserProperties.PREMIUM_CREDITS, BuildConfig.BUILD_NUMBER));
        }
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> h(Languages languages) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(UserProperties.SELECTED_APP_LANGUAGE, k(languages)));
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> i(g.b bVar) {
        String a11;
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            String d11 = bVar.d();
            String str = null;
            boolean z13 = true;
            if (d11 != null) {
                if (d11.length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    d11 = null;
                }
                if (d11 != null) {
                    arrayList.add(new Pair(UserProperties.PHONE_NUMBER, bVar.d()));
                }
            }
            String b11 = bVar.b();
            if (b11 != null) {
                if (b11.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    b11 = null;
                }
                if (b11 != null) {
                    arrayList.add(new Pair(UserProperties.FIRST_NAME, bVar.b()));
                }
            }
            if (TypeExtensionsKt.i0(bVar.f()) && (a11 = bVar.a()) != null) {
                if (a11.length() <= 0) {
                    z13 = false;
                }
                if (z13) {
                    str = a11;
                }
                if (str != null) {
                    arrayList.add(new Pair(UserProperties.EMAIL, bVar.a()));
                }
            }
        }
        return arrayList;
    }

    private final List<Pair<UserProperties, Object>> j(UserStatus userStatus) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        String l11 = l(userStatus);
        if (l11.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            l11 = null;
        }
        if (l11 != null) {
            arrayList.add(new Pair(UserProperties.REGISTRATION_STATUS, l11));
        }
        return arrayList;
    }

    private final String k(Languages languages) {
        int i11;
        if (languages == null) {
            i11 = -1;
        } else {
            i11 = a.f21987a[languages.ordinal()];
        }
        if (i11 == 1 || i11 != 2) {
            return "Arabic";
        }
        return "English";
    }

    private final String l(UserStatus userStatus) {
        int i11 = a.f21988b[userStatus.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "Deleted Account";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "Device Blocked";
                }
                return "Profile Blocked";
            }
            return "Not Logged In";
        }
        return "Logged In";
    }

    public final List<Pair<UserProperties, Object>> e(b properties) {
        o.i(properties, "properties");
        if (properties instanceof b.d) {
            return i(((b.d) properties).a());
        }
        if (properties instanceof b.C0247b) {
            return g(((b.C0247b) properties).a());
        }
        if (properties instanceof b.f) {
            return j(((b.f) properties).a());
        }
        if (properties instanceof b.c) {
            return h(((b.c) properties).a());
        }
        if (properties instanceof b.e) {
            return f(((b.e) properties).a());
        }
        if (properties instanceof b.a) {
            return a(((b.a) properties).a());
        }
        throw new NoWhenBranchMatchedException();
    }
}

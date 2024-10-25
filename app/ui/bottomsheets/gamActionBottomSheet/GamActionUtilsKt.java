package com.forsale.app.ui.bottomsheets.gamActionBottomSheet;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.MultipleOptionsBottomSheet;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.core.util.ContextExtensionKt;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kg.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import wz.p;
/* compiled from: GamActionUtils.kt */
/* loaded from: classes3.dex */
public final class GamActionUtilsKt {

    /* compiled from: GamActionUtils.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38104a;

        static {
            int[] iArr = new int[GamActionTypes.values().length];
            try {
                iArr[GamActionTypes.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamActionTypes.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GamActionTypes.WHATS_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GamActionTypes.WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GamActionTypes.DEEP_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38104a = iArr;
        }
    }

    public static final void a(Context context, List<c> gamActions, OneShotEventHandler<Boolean> oneShotEventHandler) {
        Object k02;
        o.i(context, "<this>");
        o.i(gamActions, "gamActions");
        if (gamActions.isEmpty()) {
            return;
        }
        if (gamActions.size() == 1) {
            k02 = CollectionsKt___CollectionsKt.k0(gamActions);
            c cVar = (c) k02;
            c(context, cVar.f(), cVar.g(), oneShotEventHandler);
            return;
        }
        d l11 = ContextExtensionsKt.l(context);
        if (l11 != null) {
            GamActionBottomSheet.a aVar = GamActionBottomSheet.B;
            FragmentManager supportFragmentManager = l11.getSupportFragmentManager();
            o.h(supportFragmentManager, "getSupportFragmentManager(...)");
            aVar.a(gamActions, oneShotEventHandler, supportFragmentManager);
        }
    }

    public static /* synthetic */ void b(Context context, List list, OneShotEventHandler oneShotEventHandler, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            oneShotEventHandler = null;
        }
        a(context, list, oneShotEventHandler);
    }

    public static final void c(Context context, GamActionTypes type, List<String> value, OneShotEventHandler<Boolean> oneShotEventHandler) {
        d l11;
        Object k02;
        o.i(context, "<this>");
        o.i(type, "type");
        o.i(value, "value");
        if (value.isEmpty()) {
            return;
        }
        if (value.size() == 1) {
            k02 = CollectionsKt___CollectionsKt.k0(value);
            e(context, type, (String) k02);
        } else if (value.size() > 1 && (l11 = ContextExtensionsKt.l(context)) != null) {
            MultipleOptionsBottomSheet.a aVar = MultipleOptionsBottomSheet.D;
            FragmentManager supportFragmentManager = l11.getSupportFragmentManager();
            o.h(supportFragmentManager, "getSupportFragmentManager(...)");
            aVar.a(value, type, supportFragmentManager, oneShotEventHandler);
        }
    }

    public static final List<c> d(NativeCustomFormatAd nativeCustomFormatAd) {
        String str;
        String str2;
        String str3;
        List<c> s11;
        o.i(nativeCustomFormatAd, "<this>");
        CharSequence text = nativeCustomFormatAd.getText("Phone_numbers");
        String str4 = null;
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        c f11 = f(str, GamActionTypes.PHONE);
        c f12 = f(str, GamActionTypes.MESSAGE);
        CharSequence text2 = nativeCustomFormatAd.getText("Whatsapp_numbers");
        if (text2 != null) {
            str2 = text2.toString();
        } else {
            str2 = null;
        }
        c f13 = f(str2, GamActionTypes.WHATS_APP);
        CharSequence text3 = nativeCustomFormatAd.getText(MessageTemplateConstants.Args.URL);
        if (text3 != null) {
            str3 = text3.toString();
        } else {
            str3 = null;
        }
        c f14 = f(str3, GamActionTypes.WEB);
        CharSequence text4 = nativeCustomFormatAd.getText("Deep_link");
        if (text4 != null) {
            str4 = text4.toString();
        }
        s11 = r.s(f11, f12, f13, f14, f(str4, GamActionTypes.DEEP_LINK));
        return s11;
    }

    public static final void e(Context context, GamActionTypes type, String value) {
        d l11;
        o.i(context, "<this>");
        o.i(type, "type");
        o.i(value, "value");
        int i11 = a.f38104a[type.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5 && (l11 = ContextExtensionsKt.l(context)) != null) {
                            FCMTopLevelFunctionsKt.b(l11, value);
                            return;
                        }
                        return;
                    }
                    WebActivity.a.d(WebActivity.I, context, WebType.GAM, value, value, 0, null, 24, null);
                    return;
                }
                ContextExtensionsKt.M(context, value, null, new l<Throwable, p>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt$makeGamAction$3
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Throwable th2) {
                        invoke2(th2);
                        return p.f75480a;
                    }
                }, 2, null);
                return;
            }
            ContextExtensionsKt.J(context, value, new l<Exception, p>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt$makeGamAction$2
                public final void b(Exception it2) {
                    o.i(it2, "it");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                    b(exc);
                    return p.f75480a;
                }
            });
            return;
        }
        ContextExtensionKt.a(context, value, new l<Exception, p>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt$makeGamAction$1
            public final void b(Exception it2) {
                o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                b(exc);
                return p.f75480a;
            }
        });
    }

    public static final c f(String str, GamActionTypes type) {
        List<String> g11;
        boolean z11;
        List<String> g12;
        boolean z12;
        List<String> g13;
        boolean z13;
        List e11;
        List e12;
        o.i(type, "type");
        int i11 = a.f38104a[type.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            if (str == null) {
                                return null;
                            }
                            if (!URLUtil.isValidUrl(str)) {
                                str = null;
                            }
                            if (str != null) {
                                e12 = q.e(str);
                                return new c(type, e12);
                            }
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (str == null) {
                        return null;
                    } else {
                        if (!URLUtil.isValidUrl(str)) {
                            str = null;
                        }
                        if (str != null) {
                            e11 = q.e(str);
                            return new c(type, e11);
                        }
                        return null;
                    }
                } else if (str == null || (g13 = g(str)) == null) {
                    return null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g13) {
                        if (((String) obj).length() > 5) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            arrayList.add(obj);
                        }
                    }
                    return new c(type, arrayList);
                }
            } else if (str == null || (g12 = g(str)) == null) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : g12) {
                    if (((String) obj2).length() > 5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList2.add(obj2);
                    }
                }
                return new c(type, arrayList2);
            }
        } else if (str == null || (g11 = g(str)) == null) {
            return null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : g11) {
                if (((String) obj3).length() > 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList3.add(obj3);
                }
            }
            return new c(type, arrayList3);
        }
    }

    public static final List<String> g(String str) {
        boolean v11;
        boolean N;
        CharSequence Z0;
        List<String> e11;
        List F0;
        int y11;
        CharSequence Z02;
        o.i(str, "<this>");
        v11 = s.v(str);
        if (!v11) {
            N = StringsKt__StringsKt.N(str, ",", false, 2, null);
            if (N) {
                F0 = StringsKt__StringsKt.F0(str, new String[]{","}, false, 0, 6, null);
                List<String> list = F0;
                y11 = kotlin.collections.s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (String str2 : list) {
                    Z02 = StringsKt__StringsKt.Z0(str2);
                    arrayList.add(Z02.toString());
                }
                return arrayList;
            }
            Z0 = StringsKt__StringsKt.Z0(str);
            e11 = q.e(Z0.toString());
            return e11;
        }
        return null;
    }
}

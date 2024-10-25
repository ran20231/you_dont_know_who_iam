package com.forsale.app.utils;

import androidx.lifecycle.Lifecycle;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: LocaleManager.kt */
/* loaded from: classes3.dex */
public final class LocaleManager implements androidx.lifecycle.r, CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    public static final LocaleManager f39597a;

    /* renamed from: b  reason: collision with root package name */
    private static final CoroutineContext f39598b;

    /* renamed from: c  reason: collision with root package name */
    private static jj.b f39599c;

    /* renamed from: d  reason: collision with root package name */
    private static final MutableStateFlow<String> f39600d;

    /* renamed from: e  reason: collision with root package name */
    private static final StateFlow<String> f39601e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f39602f;

    /* compiled from: LocaleManager.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager$1", f = "LocaleManager.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.utils.LocaleManager$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39603a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39604b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LocaleManager.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager$1$1", f = "LocaleManager.kt", l = {34, 34}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.utils.LocaleManager$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C04491 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f39605a;

            /* renamed from: b  reason: collision with root package name */
            int f39606b;

            C04491(zz.a<? super C04491> aVar) {
                super(2, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04491(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableStateFlow mutableStateFlow;
                Object f11 = kotlin.coroutines.intrinsics.a.f();
                int i11 = this.f39606b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            kotlin.f.b(obj);
                            return wz.p.f75480a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow = (MutableStateFlow) this.f39605a;
                    kotlin.f.b(obj);
                } else {
                    kotlin.f.b(obj);
                    Lifecycle lifecycle = androidx.lifecycle.h0.f12830i.a().getLifecycle();
                    LocaleManager localeManager = LocaleManager.f39597a;
                    lifecycle.a(localeManager);
                    MutableStateFlow mutableStateFlow2 = LocaleManager.f39600d;
                    this.f39605a = mutableStateFlow2;
                    this.f39606b = 1;
                    Object f12 = localeManager.f(this);
                    if (f12 == f11) {
                        return f11;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    obj = f12;
                }
                String str = (String) obj;
                if (str == null) {
                    str = Languages.Companion.c().getValue();
                }
                this.f39605a = null;
                this.f39606b = 2;
                if (mutableStateFlow.emit(str, this) == f11) {
                    return f11;
                }
                return wz.p.f75480a;
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                return ((C04491) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.f39604b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11 = kotlin.coroutines.intrinsics.a.f();
            int i11 = this.f39603a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                C04491 c04491 = new C04491(null);
                this.f39603a = 1;
                if (CoroutinesExtensionsKt.a((CoroutineScope) this.f39604b, c04491, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: LocaleManager.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39607a;

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
            f39607a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
        }
    }

    static {
        LocaleManager localeManager = new LocaleManager();
        f39597a = localeManager;
        f39598b = new b(CoroutineExceptionHandler.Key);
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(Languages.Companion.c().getValue());
        f39600d = MutableStateFlow;
        f39601e = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(localeManager, null, null, new AnonymousClass1(null), 3, null);
        f39602f = 8;
    }

    private LocaleManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(zz.a<? super String> aVar) {
        LocalizationSharedPrefs g11;
        jj.b bVar = f39599c;
        if (bVar != null && (g11 = bVar.g()) != null) {
            Object b11 = g11.b(aVar);
            if (b11 == kotlin.coroutines.intrinsics.a.f()) {
                return b11;
            }
            return (String) b11;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Languages languages) {
        BuildersKt.launch$default(this, null, null, new LocaleManager$setCurrentLanguage$1(languages, null), 3, null);
    }

    public final void A(jj.b bVar) {
        f39599c = bVar;
    }

    public final Languages g() {
        return Languages.Companion.a(f39601e.getValue());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return f39598b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zz.a<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.utils.LocaleManager$getCurrentLanguageAsync$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.utils.LocaleManager$getCurrentLanguageAsync$1 r0 = (com.forsale.app.utils.LocaleManager$getCurrentLanguageAsync$1) r0
            int r1 = r0.f39610c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39610c = r1
            goto L18
        L13:
            com.forsale.app.utils.LocaleManager$getCurrentLanguageAsync$1 r0 = new com.forsale.app.utils.LocaleManager$getCurrentLanguageAsync$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f39608a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39610c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.f39610c = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L4b
            com.forsale.app.utils.Languages$a r5 = com.forsale.app.utils.Languages.Companion
            com.forsale.app.utils.Languages r5 = r5.c()
            java.lang.String r5 = r5.getValue()
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.LocaleManager.h(zz.a):java.lang.Object");
    }

    public final GAMRepository.LanguageId j() {
        return GAMRepository.LanguageId.Companion.toLanguageId(Languages.Companion.a(f39601e.getValue()));
    }

    public final String k() {
        return f39601e.getValue();
    }

    public final Locale l() {
        return new Locale(g().getValue());
    }

    public final StateFlow<String> m() {
        return f39601e;
    }

    public final Languages o() {
        Languages g11 = g();
        int i11 = a.f39607a[g11.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            return Languages.ENGLISH;
        }
        if (i11 != 2 && g11 != Languages.Companion.c()) {
            z11 = false;
        }
        if (z11) {
            return Languages.ARABIC;
        }
        throw new NoWhenBranchMatchedException();
    }

    @androidx.lifecycle.d0(Lifecycle.Event.ON_DESTROY)
    public final void onAppDestroy() {
        androidx.lifecycle.h0.f12830i.a().getLifecycle().d(this);
    }

    public final jj.b p() {
        return f39599c;
    }

    public final boolean r() {
        return kotlin.jvm.internal.o.d(k(), Languages.ARABIC.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.forsale.app.utils.Languages r5, zz.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.LocaleManager$setCurrentLanguageDistinct$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.LocaleManager$setCurrentLanguageDistinct$1 r0 = (com.forsale.app.utils.LocaleManager$setCurrentLanguageDistinct$1) r0
            int r1 = r0.f39616d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39616d = r1
            goto L18
        L13:
            com.forsale.app.utils.LocaleManager$setCurrentLanguageDistinct$1 r0 = new com.forsale.app.utils.LocaleManager$setCurrentLanguageDistinct$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39614b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39616d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f39613a
            com.forsale.app.utils.Languages r5 = (com.forsale.app.utils.Languages) r5
            kotlin.f.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            r0.f39613a = r5
            r0.f39616d = r3
            java.lang.Object r6 = r4.f(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = r5.getValue()
            boolean r6 = kotlin.jvm.internal.o.d(r6, r0)
            if (r6 != 0) goto L55
            com.forsale.app.utils.LocaleManager r6 = com.forsale.app.utils.LocaleManager.f39597a
            r6.v(r5)
            goto L56
        L55:
            r3 = 0
        L56:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.LocaleManager.w(com.forsale.app.utils.Languages, zz.a):java.lang.Object");
    }

    public final void y(Languages language) {
        kotlin.jvm.internal.o.i(language, "language");
        BuildersKt.launch$default(this, null, null, new LocaleManager$setCurrentLanguageIfNotSet$1(language, null), 3, null);
    }
}

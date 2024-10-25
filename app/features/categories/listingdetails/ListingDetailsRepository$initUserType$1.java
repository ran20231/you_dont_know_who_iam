package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.datalayer.database.UserEntity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initUserType$1", f = "ListingDetailsRepository.kt", l = {FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$initUserType$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25243a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25244b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f25245c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingDetailsRepository.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initUserType$1$1", f = "ListingDetailsRepository.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 112, 113}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initUserType$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<UserEntity, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f25246a;

        /* renamed from: b  reason: collision with root package name */
        Object f25247b;

        /* renamed from: c  reason: collision with root package name */
        boolean f25248c;

        /* renamed from: d  reason: collision with root package name */
        int f25249d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25250e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ListingDetailsRepository f25251f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f25252g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingDetailsRepository listingDetailsRepository, String str, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f25251f = listingDetailsRepository;
            this.f25252g = str;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(UserEntity userEntity, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(userEntity, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25251f, this.f25252g, aVar);
            anonymousClass1.f25250e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r10.f25249d
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3a
                if (r1 == r5) goto L31
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.f.b(r11)
                goto Laf
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                boolean r1 = r10.f25248c
                java.lang.Object r4 = r10.f25247b
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r10.f25246a
                com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r6 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r6
                java.lang.Object r7 = r10.f25250e
                com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
                kotlin.f.b(r11)
                goto L86
            L31:
                java.lang.Object r1 = r10.f25250e
                com.forsale.app.datalayer.database.UserEntity r1 = (com.forsale.app.datalayer.database.UserEntity) r1
                kotlin.f.b(r11)
                r7 = r1
                goto L58
            L3a:
                kotlin.f.b(r11)
                java.lang.Object r11 = r10.f25250e
                com.forsale.app.datalayer.database.UserEntity r11 = (com.forsale.app.datalayer.database.UserEntity) r11
                com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r1 = r10.f25251f
                jj.b r1 = com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.b(r1)
                com.forsale.app.utils.prefUtils.preferences.UserSharedPref r1 = r1.l()
                r10.f25250e = r11
                r10.f25249d = r5
                java.lang.Object r1 = r1.c(r10)
                if (r1 != r0) goto L56
                return r0
            L56:
                r7 = r11
                r11 = r1
            L58:
                com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r6 = r10.f25251f
                java.lang.String r1 = r10.f25252g
                java.lang.String r11 = (java.lang.String) r11
                if (r11 == 0) goto L69
                int r11 = r11.length()
                if (r11 != 0) goto L67
                goto L69
            L67:
                r11 = r2
                goto L6a
            L69:
                r11 = r5
            L6a:
                r11 = r11 ^ r5
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.g(r6)
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r11)
                r10.f25250e = r7
                r10.f25246a = r6
                r10.f25247b = r1
                r10.f25248c = r11
                r10.f25249d = r4
                java.lang.Object r4 = r8.emit(r9, r10)
                if (r4 != r0) goto L84
                return r0
            L84:
                r4 = r1
                r1 = r11
            L86:
                kotlinx.coroutines.flow.MutableStateFlow r11 = com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.f(r6)
                r6 = 0
                if (r7 == 0) goto L92
                java.lang.String r7 = r7.getPhone()
                goto L93
            L92:
                r7 = r6
            L93:
                boolean r4 = kotlin.jvm.internal.o.d(r7, r4)
                if (r4 == 0) goto L9c
                if (r1 == 0) goto L9c
                r2 = r5
            L9c:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r2)
                r10.f25250e = r6
                r10.f25246a = r6
                r10.f25247b = r6
                r10.f25249d = r3
                java.lang.Object r11 = r11.emit(r1, r10)
                if (r11 != r0) goto Laf
                return r0
            Laf:
                wz.p r11 = wz.p.f75480a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initUserType$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$initUserType$1(ListingDetailsRepository listingDetailsRepository, String str, zz.a<? super ListingDetailsRepository$initUserType$1> aVar) {
        super(2, aVar);
        this.f25244b = listingDetailsRepository;
        this.f25245c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsRepository$initUserType$1(this.f25244b, this.f25245c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Flow flow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25243a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            flow = this.f25244b.f25196x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25244b, this.f25245c, null);
            this.f25243a = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsRepository$initUserType$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

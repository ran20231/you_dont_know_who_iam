package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionManualRepostItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$loadRepost$1", f = "SellerActionManualRepostItemViewModel.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionManualRepostItemViewModel$loadRepost$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionManualRepostItemViewModel f38751b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerActionManualRepostItemViewModel.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$loadRepost$1$1", f = "SellerActionManualRepostItemViewModel.kt", l = {86, 87, 88}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$loadRepost$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SellerActionManualRepostItemViewModel f38753b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38753b = sellerActionManualRepostItemViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f38753b, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r5.f38752a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.f.b(r6)
                goto L59
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.f.b(r6)
                goto L46
            L21:
                kotlin.f.b(r6)
                goto L33
            L25:
                kotlin.f.b(r6)
                com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r6 = r5.f38753b
                r5.f38752a = r4
                java.lang.Object r6 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.h(r6, r5)
                if (r6 != r0) goto L33
                return r0
            L33:
                com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r6 = r5.f38753b
                com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.d(r6)
                int r1 = r1.getRegId()
                r5.f38752a = r3
                java.lang.Object r6 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.f(r6, r1, r5)
                if (r6 != r0) goto L46
                return r0
            L46:
                com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel r6 = r5.f38753b
                com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.d(r6)
                int r1 = r1.getCatId()
                r5.f38752a = r2
                java.lang.Object r6 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel.b(r6, r1, r5)
                if (r6 != r0) goto L59
                return r0
            L59:
                wz.p r6 = wz.p.f75480a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.manualrepost.SellerActionManualRepostItemViewModel$loadRepost$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionManualRepostItemViewModel$loadRepost$1(SellerActionManualRepostItemViewModel sellerActionManualRepostItemViewModel, a<? super SellerActionManualRepostItemViewModel$loadRepost$1> aVar) {
        super(2, aVar);
        this.f38751b = sellerActionManualRepostItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionManualRepostItemViewModel$loadRepost$1(this.f38751b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38750a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38751b, null);
            this.f38750a = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionManualRepostItemViewModel$loadRepost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

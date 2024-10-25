package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialogViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$onCallClicked$1", f = "MediaDialogViewModel.kt", l = {104, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialogViewModel$onCallClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f26205a;

    /* renamed from: b  reason: collision with root package name */
    Object f26206b;

    /* renamed from: c  reason: collision with root package name */
    Object f26207c;

    /* renamed from: d  reason: collision with root package name */
    int f26208d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26209e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f26210f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialogViewModel$onCallClicked$1(MediaDialogViewModel mediaDialogViewModel, String str, zz.a<? super MediaDialogViewModel$onCallClicked$1> aVar) {
        super(2, aVar);
        this.f26209e = mediaDialogViewModel;
        this.f26210f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialogViewModel$onCallClicked$1(this.f26209e, this.f26210f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f26208d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r11)
            goto Lbd
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f26207c
            cb.b r1 = (cb.b) r1
            java.lang.Object r3 = r10.f26206b
            java.lang.Object r4 = r10.f26205a
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r4 = (com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel) r4
            kotlin.f.b(r11)
            goto La8
        L2d:
            java.lang.Object r1 = r10.f26205a
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r1 = (com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel) r1
            kotlin.f.b(r11)
            r4 = r1
            goto L8b
        L36:
            kotlin.f.b(r11)
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r11 = r10.f26209e
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r11 = r11.A()
            if (r11 == 0) goto Lbd
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r11 = r10.f26209e
            java.lang.String r1 = r10.f26210f
            boolean r5 = r11.F()
            boolean r6 = r11.q()
            com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility r7 = r11.p()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Details:: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = " "
            r8.append(r5)
            r8.append(r6)
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            x10.a.b(r5, r6)
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor r5 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel.e(r11)
            com.forsale.app.features.categories.listingdetails.models.DetailsModel r6 = r11.A()
            r10.f26205a = r11
            r10.f26208d = r4
            java.lang.Object r1 = r5.s(r6, r1, r10)
            if (r1 != r0) goto L89
            return r0
        L89:
            r4 = r11
            r11 = r1
        L8b:
            r1 = r11
            cb.b r1 = (cb.b) r1
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs r5 = r4.z()
            if (r5 == 0) goto La9
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor r6 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel.f(r4)
            r10.f26205a = r4
            r10.f26206b = r11
            r10.f26207c = r1
            r10.f26208d = r3
            java.lang.Object r3 = r6.a(r1, r5, r10)
            if (r3 != r0) goto La7
            return r0
        La7:
            r3 = r11
        La8:
            r11 = r3
        La9:
            kotlinx.coroutines.flow.MutableSharedFlow r3 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel.g(r4)
            r10.f26205a = r11
            r11 = 0
            r10.f26206b = r11
            r10.f26207c = r11
            r10.f26208d = r2
            java.lang.Object r11 = r3.emit(r1, r10)
            if (r11 != r0) goto Lbd
            return r0
        Lbd:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$onCallClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialogViewModel$onCallClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

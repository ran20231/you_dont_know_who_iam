package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onChatClicked$1", f = "NewListingDetailsViewModel.kt", l = {496, 497, 501, 504, 505}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onChatClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27290a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27291b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel.ActionType f27292c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onChatClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, NewListingDetailsViewModel.ActionType actionType, zz.a<? super NewListingDetailsViewModel$onChatClicked$1> aVar) {
        super(2, aVar);
        this.f27291b = newListingDetailsViewModel;
        this.f27292c = actionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onChatClicked$1(this.f27291b, this.f27292c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f27290a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.f.b(r8)
            goto Lb9
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            kotlin.f.b(r8)
            goto La8
        L29:
            kotlin.f.b(r8)
            goto L92
        L2d:
            kotlin.f.b(r8)
            goto Lc3
        L32:
            kotlin.f.b(r8)
            goto L48
        L36:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r8 = r8.R1()
            r7.f27290a = r6
            java.lang.Object r8 = r8.C1(r7)
            if (r8 != r0) goto L48
            return r0
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L65
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r8 = r8.R1()
            kotlinx.coroutines.flow.MutableSharedFlow r8 = r8.g1()
            com.forsale.app.features.auth.login.SignInIntention r1 = com.forsale.app.features.auth.login.SignInIntention.CHAT
            r7.f27290a = r5
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto Lc3
            return r0
        L65:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.b1(r8)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            androidx.lifecycle.b0 r8 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.S0(r8)
            java.lang.Object r8 = r8.getValue()
            r1 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r1)
            boolean r8 = kotlin.jvm.internal.o.d(r8, r5)
            if (r8 == 0) goto L95
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.utils.OneShotEventHandler r8 = r8.U1()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r6)
            r7.f27290a = r4
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 != r0) goto L92
            return r0
        L92:
            wz.p r8 = wz.p.f75480a
            return r8
        L95:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.utils.OneShotEventHandler r8 = r8.U1()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
            r7.f27290a = r3
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 != r0) goto La8
            return r0
        La8:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.utils.OneShotEventHandler r8 = r8.a2()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$ActionType r1 = r7.f27292c
            r7.f27290a = r2
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 != r0) goto Lb9
            return r0
        Lb9:
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r8 = r7.f27291b
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onChatClicked$1$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onChatClicked$1$1
            r0.<init>()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.z0(r8, r0)
        Lc3:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onChatClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onChatClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

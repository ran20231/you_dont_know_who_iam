package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1", f = "NewListingDetailsViewModel.kt", l = {333, 349, 353}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$contactUserNow$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27240a;

    /* renamed from: b  reason: collision with root package name */
    int f27241b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27242c;

    /* compiled from: NewListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27247a;

        static {
            int[] iArr = new int[UserContactMode.values().length];
            try {
                iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserContactMode.WHATSAPP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserContactMode.MORE_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27247a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$contactUserNow$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$contactUserNow$1> aVar) {
        super(2, aVar);
        this.f27242c = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$contactUserNow$1(this.f27242c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f27241b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L11
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
        L11:
            kotlin.f.b(r10)
            goto Lc3
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f27240a
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r1 = (com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel) r1
            kotlin.f.b(r10)
            goto L78
        L26:
            kotlin.f.b(r10)
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r10 = r9.f27242c
            androidx.lifecycle.LiveData r10 = r10.Q1()
            java.lang.Object r10 = r10.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r10 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r10
            if (r10 == 0) goto Lc3
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel r1 = r9.f27242c
            java.util.List r5 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.H0(r1)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            if (r6 == 0) goto L4c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L4a
            goto L4c
        L4a:
            r6 = r7
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 == 0) goto L52
            wz.p r10 = wz.p.f75480a
            return r10
        L52:
            com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r6 = r1.h2()
            int[] r8 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1.a.f27247a
            int r6 = r6.ordinal()
            r6 = r8[r6]
            if (r6 == r4) goto Laa
            if (r6 == r3) goto L8a
            if (r6 == r2) goto L65
            goto Lc3
        L65:
            java.lang.String r4 = r10.getContacts()
            if (r4 == 0) goto Lc3
            com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode r4 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode.MORE_ACTIONS
            r9.f27240a = r1
            r9.f27241b = r3
            java.lang.Object r10 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.C0(r1, r4, r10, r9)
            if (r10 != r0) goto L78
            return r0
        L78:
            tg.c r10 = (tg.c) r10
            com.forsale.app.utils.OneShotEventHandler r1 = r1.S1()
            r3 = 0
            r9.f27240a = r3
            r9.f27241b = r2
            java.lang.Object r10 = r1.f(r10, r9)
            if (r10 != r0) goto Lc3
            return r0
        L8a:
            int r0 = r5.size()
            if (r0 != r4) goto L9d
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r10 = r1.R1()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1$1$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1$1$1
            r0.<init>()
            r10.I0(r0)
            goto Lc3
        L9d:
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r0 = r1.R1()
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1$1$2 r2 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1$1$2
            r2.<init>()
            r0.I0(r2)
            goto Lc3
        Laa:
            int r2 = r5.size()
            if (r2 != r4) goto Lba
            java.lang.Object r10 = r5.get(r7)
            java.lang.String r10 = (java.lang.String) r10
            com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.w0(r1, r10)
            goto Lc3
        Lba:
            r9.f27241b = r4
            java.lang.Object r10 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.x0(r1, r10, r9)
            if (r10 != r0) goto Lc3
            return r0
        Lc3:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$contactUserNow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$contactUserNow$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

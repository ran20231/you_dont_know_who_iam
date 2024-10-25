package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1", f = "ListingDetailsViewModel.kt", l = {157, 156}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25360a;

    /* renamed from: b  reason: collision with root package name */
    Object f25361b;

    /* renamed from: c  reason: collision with root package name */
    Object f25362c;

    /* renamed from: d  reason: collision with root package name */
    int f25363d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25364e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f25365f;

    /* compiled from: ListingDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25366a;

        static {
            int[] iArr = new int[ListingDetailsOwnerActions.values().length];
            try {
                iArr[ListingDetailsOwnerActions.BOOST_ADDONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25366a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1(ListingDetailsViewModel listingDetailsViewModel, ListingItemDetails listingItemDetails, zz.a<? super ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1> aVar) {
        super(2, aVar);
        this.f25364e = listingDetailsViewModel;
        this.f25365f = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1(this.f25364e, this.f25365f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f25363d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r8)
            goto L7a
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f25362c
            com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r1
            java.lang.Object r3 = r7.f25361b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r3 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion) r3
            java.lang.Object r4 = r7.f25360a
            kotlinx.coroutines.flow.MutableSharedFlow r4 = (kotlinx.coroutines.flow.MutableSharedFlow) r4
            kotlin.f.b(r8)
            goto L64
        L2a:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r8 = r7.f25364e
            com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions r8 = com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.v0(r8)
            int[] r1 = com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1.a.f25366a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            if (r8 != r3) goto L7a
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r8 = r7.f25364e
            kotlinx.coroutines.flow.MutableSharedFlow r4 = com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.y0(r8)
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity$Companion r8 = com.forsale.app.datalayer.network.entities.ListingDetailsEntity.Companion
            com.forsale.app.datalayer.network.responses.ListingItemDetails r1 = r7.f25365f
            java.lang.String r5 = "$details"
            kotlin.jvm.internal.o.h(r1, r5)
            com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel r5 = r7.f25364e
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r5 = r5.j1()
            r7.f25360a = r4
            r7.f25361b = r8
            r7.f25362c = r1
            r7.f25363d = r3
            java.lang.Object r3 = r5.q(r7)
            if (r3 != r0) goto L61
            return r0
        L61:
            r6 = r3
            r3 = r8
            r8 = r6
        L64:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r8 = r3.from(r1, r8)
            r1 = 0
            r7.f25360a = r1
            r7.f25361b = r1
            r7.f25362c = r1
            r7.f25363d = r2
            java.lang.Object r8 = r4.emit(r8, r7)
            if (r8 != r0) goto L7a
            return r0
        L7a:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$boostYourAdFromDeepLinking$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

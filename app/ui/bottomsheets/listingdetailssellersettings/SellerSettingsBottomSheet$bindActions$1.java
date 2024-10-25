package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerSettingsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$bindActions$1", f = "SellerSettingsBottomSheet.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerSettingsBottomSheet$bindActions$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38845a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38846b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SellerSettingsBottomSheet f38847c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerSettingsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$bindActions$1$1", f = "SellerSettingsBottomSheet.kt", l = {105, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 113, 115}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$bindActions$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38849a;

        /* renamed from: b  reason: collision with root package name */
        Object f38850b;

        /* renamed from: c  reason: collision with root package name */
        Object f38851c;

        /* renamed from: d  reason: collision with root package name */
        Object f38852d;

        /* renamed from: e  reason: collision with root package name */
        Object f38853e;

        /* renamed from: f  reason: collision with root package name */
        Object f38854f;

        /* renamed from: g  reason: collision with root package name */
        Object f38855g;

        /* renamed from: h  reason: collision with root package name */
        int f38856h;

        /* renamed from: i  reason: collision with root package name */
        int f38857i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ SellerSettingsBottomSheet f38858j;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ ListingItemDetails f38859x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SellerSettingsBottomSheet.kt */
        /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$bindActions$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C04381 extends FunctionReferenceImpl implements l<ListingItemDetails, wz.p> {
            C04381(Object obj) {
                super(1, obj, SellerSettingsBottomSheet.class, "openRepost", "openRepost(Lcom/forsale/app/datalayer/network/responses/ListingItemDetails;)V", 0);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(ListingItemDetails listingItemDetails) {
                m(listingItemDetails);
                return wz.p.f75480a;
            }

            public final void m(ListingItemDetails p02) {
                o.i(p02, "p0");
                ((SellerSettingsBottomSheet) this.receiver).M(p02);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerSettingsBottomSheet sellerSettingsBottomSheet, ListingItemDetails listingItemDetails, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38858j = sellerSettingsBottomSheet;
            this.f38859x = listingItemDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f38858j, this.f38859x, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0246 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x02ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x02ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 720
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$bindActions$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerSettingsBottomSheet$bindActions$1(SellerSettingsBottomSheet sellerSettingsBottomSheet, ListingItemDetails listingItemDetails, a<? super SellerSettingsBottomSheet$bindActions$1> aVar) {
        super(2, aVar);
        this.f38847c = sellerSettingsBottomSheet;
        this.f38848d = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        SellerSettingsBottomSheet$bindActions$1 sellerSettingsBottomSheet$bindActions$1 = new SellerSettingsBottomSheet$bindActions$1(this.f38847c, this.f38848d, aVar);
        sellerSettingsBottomSheet$bindActions$1.f38846b = obj;
        return sellerSettingsBottomSheet$bindActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38845a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38847c, this.f38848d, null);
            this.f38845a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f38846b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerSettingsBottomSheet$bindActions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

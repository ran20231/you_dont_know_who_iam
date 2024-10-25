package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import android.content.Context;
import androidx.activity.result.b;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zf.a;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerSettingsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet$openRepost$1", f = "SellerSettingsBottomSheet.kt", l = {141, 143}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerSettingsBottomSheet$openRepost$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f38866a;

    /* renamed from: b  reason: collision with root package name */
    Object f38867b;

    /* renamed from: c  reason: collision with root package name */
    int f38868c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38869d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SellerSettingsBottomSheet f38870e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerSettingsBottomSheet$openRepost$1(ListingItemDetails listingItemDetails, SellerSettingsBottomSheet sellerSettingsBottomSheet, a<? super SellerSettingsBottomSheet$openRepost$1> aVar) {
        super(2, aVar);
        this.f38869d = listingItemDetails;
        this.f38870e = sellerSettingsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerSettingsBottomSheet$openRepost$1(this.f38869d, this.f38870e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingItemDetails listingItemDetails;
        ListingDetailsEntity.Companion companion;
        b bVar;
        b bVar2;
        ListingDetailsEntity listingDetailsEntity;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38868c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    bVar2 = (b) this.f38867b;
                    f.b(obj);
                    listingDetailsEntity = (ListingDetailsEntity) this.f38866a;
                    Context requireContext = this.f38870e.requireContext();
                    o.h(requireContext, "requireContext(...)");
                    bVar2.a(((zf.b) obj).b(requireContext, new a.C0991a(null, PostListingIntention.RE_POST, listingDetailsEntity, 1, null)));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listingItemDetails = (ListingItemDetails) this.f38867b;
            companion = (ListingDetailsEntity.Companion) this.f38866a;
            f.b(obj);
        } else {
            f.b(obj);
            ListingDetailsEntity.Companion companion2 = ListingDetailsEntity.Companion;
            listingItemDetails = this.f38869d;
            SellerSettingsViewModel t11 = this.f38870e.t();
            this.f38866a = companion2;
            this.f38867b = listingItemDetails;
            this.f38868c = 1;
            Object v02 = t11.v0(this);
            if (v02 == f11) {
                return f11;
            }
            companion = companion2;
            obj = v02;
        }
        ListingDetailsEntity from = companion.from(listingItemDetails, (String) obj);
        bVar = this.f38870e.D;
        this.f38866a = from;
        this.f38867b = bVar;
        this.f38868c = 2;
        Object a11 = this.f38870e.J().get().a(this);
        if (a11 == f11) {
            return f11;
        }
        bVar2 = bVar;
        listingDetailsEntity = from;
        obj = a11;
        Context requireContext2 = this.f38870e.requireContext();
        o.h(requireContext2, "requireContext(...)");
        bVar2.a(((zf.b) obj).b(requireContext2, new a.C0991a(null, PostListingIntention.RE_POST, listingDetailsEntity, 1, null)));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SellerSettingsBottomSheet$openRepost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

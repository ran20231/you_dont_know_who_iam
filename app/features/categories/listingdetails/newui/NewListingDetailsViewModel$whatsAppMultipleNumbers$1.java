package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import tg.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$whatsAppMultipleNumbers$1", f = "NewListingDetailsViewModel.kt", l = {690, 694}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$whatsAppMultipleNumbers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27327b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f27328c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$whatsAppMultipleNumbers$1(NewListingDetailsViewModel newListingDetailsViewModel, ListingItemDetails listingItemDetails, zz.a<? super NewListingDetailsViewModel$whatsAppMultipleNumbers$1> aVar) {
        super(2, aVar);
        this.f27327b = newListingDetailsViewModel;
        this.f27328c = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$whatsAppMultipleNumbers$1(this.f27327b, this.f27328c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27326a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            this.f27327b.M2();
            NewListingDetailsViewModel newListingDetailsViewModel = this.f27327b;
            UserContactMode userContactMode = UserContactMode.WHATSAPP_ONLY;
            ListingItemDetails listingItemDetails = this.f27328c;
            this.f27326a = 1;
            obj = newListingDetailsViewModel.u1(userContactMode, listingItemDetails, this);
            if (obj == f11) {
                return f11;
            }
        }
        OneShotEventHandler<c> j22 = this.f27327b.j2();
        this.f27326a = 2;
        if (j22.f((c) obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$whatsAppMultipleNumbers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

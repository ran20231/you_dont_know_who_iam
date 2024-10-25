package com.forsale.app.features.categories.user.profile;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileViewModel$getListingDetails$1", f = "UserProfileViewModel.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserProfileViewModel$getListingDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserProfileViewModel f31196b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31197c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$getListingDetails$1(UserProfileViewModel userProfileViewModel, int i11, zz.a<? super UserProfileViewModel$getListingDetails$1> aVar) {
        super(2, aVar);
        this.f31196b = userProfileViewModel;
        this.f31197c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserProfileViewModel$getListingDetails$1(this.f31196b, this.f31197c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsService listingsService;
        b0 b0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31195a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            listingsService = this.f31196b.f31178o0;
            GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(this.f31197c), LocaleManager.f39597a.g(), null, 4, null);
            this.f31195a = 1;
            obj = listingsService.getListingDetails(createListingDetails$default, this);
            if (obj == f11) {
                return f11;
            }
        }
        b0Var = this.f31196b.f31189z0;
        b0Var.postValue((ListingItemDetails) obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserProfileViewModel$getListingDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

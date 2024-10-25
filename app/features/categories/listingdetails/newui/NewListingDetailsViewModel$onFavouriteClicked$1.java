package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onFavouriteClicked$1", f = "NewListingDetailsViewModel.kt", l = {741, 742}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onFavouriteClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27301a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onFavouriteClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$onFavouriteClicked$1> aVar) {
        super(2, aVar);
        this.f27302b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onFavouriteClicked$1(this.f27302b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27301a;
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
            ListingDetailsViewModel R1 = this.f27302b.R1();
            this.f27301a = 1;
            obj = R1.C1(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            MutableSharedFlow<SignInIntention> g12 = this.f27302b.R1().g1();
            SignInIntention signInIntention = SignInIntention.FAVORITE;
            this.f27301a = 2;
            if (g12.emit(signInIntention, this) == f11) {
                return f11;
            }
        } else {
            ListingDetailsViewModel R12 = this.f27302b.R1();
            final NewListingDetailsViewModel newListingDetailsViewModel = this.f27302b;
            R12.I0(new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onFavouriteClicked$1.1
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NewListingDetailsViewModel.this.K1().postValue(NewListingDetailsViewModel.FavouriteState.PENDING);
                    if (NewListingDetailsViewModel.this.K1().getValue() == NewListingDetailsViewModel.FavouriteState.IS_FAVOURITE) {
                        NewListingDetailsViewModel.this.Z2();
                    } else if (NewListingDetailsViewModel.this.K1().getValue() == NewListingDetailsViewModel.FavouriteState.IS_NOT_FAVOURITE) {
                        NewListingDetailsViewModel.this.g1();
                    }
                }
            });
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onFavouriteClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

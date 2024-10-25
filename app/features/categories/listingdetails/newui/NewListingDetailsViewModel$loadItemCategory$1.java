package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$loadItemCategory$1", f = "NewListingDetailsViewModel.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$loadItemCategory$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$loadItemCategory$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$loadItemCategory$1> aVar) {
        super(2, aVar);
        this.f27279b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$loadItemCategory$1(this.f27279b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27278a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingDetailsViewModel R1 = this.f27279b.R1();
            this.f27278a = 1;
            obj = R1.F1(this);
            if (obj == f11) {
                return f11;
            }
        }
        CategoryEntity categoryEntity = (CategoryEntity) obj;
        if (categoryEntity != null) {
            b0Var = this.f27279b.f27163c1;
            b0Var.postValue(categoryEntity);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$loadItemCategory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

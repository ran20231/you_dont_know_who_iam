package com.forsale.app.features.categories.normal;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import g00.l;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.normal.SubCategoriesViewModel$getListings$1", f = "SubCategoriesViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$getListings$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f31057b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$getListings$1(SubCategoriesViewModel subCategoriesViewModel, zz.a<? super SubCategoriesViewModel$getListings$1> aVar) {
        super(2, aVar);
        this.f31057b = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SubCategoriesViewModel$getListings$1(this.f31057b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31056a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            this.f31057b.f31046z0.postValue(kotlin.coroutines.jvm.internal.a.a(false));
            final SubCategoriesViewModel subCategoriesViewModel = this.f31057b;
            l<ListingsResponse, wz.p> lVar = new l<ListingsResponse, wz.p>() { // from class: com.forsale.app.features.categories.normal.SubCategoriesViewModel$getListings$1.1
                {
                    super(1);
                }

                public final void b(ListingsResponse response) {
                    b0 b0Var;
                    List h12;
                    o.i(response, "response");
                    if (!response.getListings().getPinnedItems().isEmpty()) {
                        b0Var = SubCategoriesViewModel.this.B0;
                        h12 = SubCategoriesViewModel.this.h1(response.getListings().getPinnedItems(), response.getUiSettings().getListingsSettings());
                        b0Var.postValue(h12);
                    }
                    SubCategoriesViewModel.this.f31046z0.postValue(Boolean.TRUE);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(ListingsResponse listingsResponse) {
                    b(listingsResponse);
                    return wz.p.f75480a;
                }
            };
            this.f31056a = 1;
            f12 = subCategoriesViewModel.f1(lVar, this);
            if (f12 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SubCategoriesViewModel$getListings$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.ui.bottomsheets.postaddistricts;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdDistrictsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.postaddistricts.PostAdDistrictsViewModel$loadDistricts$2", f = "PostAdDistrictsViewModel.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PostAdDistrictsViewModel$loadDistricts$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39001a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdDistrictsViewModel f39002b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdDistrictsViewModel$loadDistricts$2(PostAdDistrictsViewModel postAdDistrictsViewModel, zz.a<? super PostAdDistrictsViewModel$loadDistricts$2> aVar) {
        super(2, aVar);
        this.f39002b = postAdDistrictsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdDistrictsViewModel$loadDistricts$2(this.f39002b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DistrictsRepository districtsRepository;
        int i11;
        b0 b0Var;
        f11 = b.f();
        int i12 = this.f39001a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            districtsRepository = this.f39002b.f38996l0;
            i11 = this.f39002b.f38995k0;
            this.f39001a = 1;
            obj = districtsRepository.getAllDistrictsByLevel(i11, this);
            if (obj == f11) {
                return f11;
            }
        }
        List list = (List) obj;
        if (list != null) {
            b0Var = this.f39002b.f38997m0;
            b0Var.postValue(list);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdDistrictsViewModel$loadDistricts$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

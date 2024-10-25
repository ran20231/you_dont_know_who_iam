package com.forsale.app.features.categories.home;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseCategoryViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.BaseCategoryViewModel$loadCategories$1", f = "BaseCategoryViewModel.kt", l = {32, 32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseCategoryViewModel$loadCategories$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f23269a;

    /* renamed from: b  reason: collision with root package name */
    int f23270b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseCategoryViewModel f23271c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCategoryViewModel$loadCategories$1(BaseCategoryViewModel baseCategoryViewModel, a<? super BaseCategoryViewModel$loadCategories$1> aVar) {
        super(2, aVar);
        this.f23271c = baseCategoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseCategoryViewModel$loadCategories$1(this.f23271c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OneShotEventHandler x02;
        CategoryEntity y02;
        Integer num;
        f11 = b.f();
        int i11 = this.f23270b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x02 = (OneShotEventHandler) this.f23269a;
            f.b(obj);
        } else {
            f.b(obj);
            x02 = this.f23271c.x0();
            CategoriesRepositories s11 = this.f23271c.s();
            y02 = this.f23271c.y0();
            if (y02 != null) {
                num = kotlin.coroutines.jvm.internal.a.d(y02.getId());
            } else {
                num = null;
            }
            this.f23269a = x02;
            this.f23270b = 1;
            obj = s11.getCategoriesNestedSuspended(num, this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f23269a = null;
        this.f23270b = 2;
        if (x02.f(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseCategoryViewModel$loadCategories$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

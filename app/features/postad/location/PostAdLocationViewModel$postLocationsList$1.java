package com.forsale.app.features.postad.location;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.database.DistrictEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$postLocationsList$1", f = "PostAdLocationViewModel.kt", l = {631}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$postLocationsList$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35744a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<DistrictEntity> f35745b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35746c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryRuleSet.Level f35747d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Integer f35748e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$postLocationsList$1(List<DistrictEntity> list, PostAdLocationViewModel postAdLocationViewModel, CategoryRuleSet.Level level, Integer num, zz.a<? super PostAdLocationViewModel$postLocationsList$1> aVar) {
        super(2, aVar);
        this.f35745b = list;
        this.f35746c = postAdLocationViewModel;
        this.f35747d = level;
        this.f35748e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$postLocationsList$1(this.f35745b, this.f35746c, this.f35747d, this.f35748e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z11;
        f11 = b.f();
        int i11 = this.f35744a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            List<DistrictEntity> list = this.f35745b;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                x10.a.b("Selector:: postLocationsList", new Object[0]);
                MutableSharedFlow<xe.b> E1 = this.f35746c.E1();
                xe.b bVar = new xe.b(this.f35745b, this.f35747d, this.f35748e);
                this.f35744a = 1;
                if (E1.emit(bVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$postLocationsList$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

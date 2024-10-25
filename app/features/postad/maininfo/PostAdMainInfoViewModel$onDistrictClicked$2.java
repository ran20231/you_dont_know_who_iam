package com.forsale.app.features.postad.maininfo;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.postad.location.LocationLevels;
import g00.p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$2", f = "PostAdMainInfoViewModel.kt", l = {184, 187}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$onDistrictClicked$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$onDistrictClicked$2(PostAdMainInfoViewModel postAdMainInfoViewModel, zz.a<? super PostAdMainInfoViewModel$onDistrictClicked$2> aVar) {
        super(2, aVar);
        this.f35890b = postAdMainInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$onDistrictClicked$2(this.f35890b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DistrictsRepository districtsRepository;
        CategoryRuleSet.Level level;
        boolean z11;
        MutableSharedFlow mutableSharedFlow;
        CategoryRuleSet.LocationSettings locationSettings;
        List<CategoryRuleSet.Level> levels;
        Object obj2;
        boolean z12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35889a;
        boolean z13 = true;
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
            districtsRepository = this.f35890b.f35863l0;
            int level2 = LocationLevels.DISTRICT.getLevel();
            this.f35889a = 1;
            obj = districtsRepository.getAllDistrictsByLevel(level2, this);
            if (obj == f11) {
                return f11;
            }
        }
        List list = (List) obj;
        CategoryRuleSet.RuleSet value = this.f35890b.O0().d2().getValue();
        xe.b bVar = null;
        if (value != null && (locationSettings = value.getLocationSettings()) != null && (levels = locationSettings.getLevels()) != null) {
            Iterator<T> it2 = levels.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((CategoryRuleSet.Level) obj2).getLevel() == LocationLevels.DISTRICT.getLevel()) {
                        z12 = true;
                        continue;
                    } else {
                        z12 = false;
                        continue;
                    }
                    if (z12) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            level = (CategoryRuleSet.Level) obj2;
        } else {
            level = null;
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || level == null) {
            z13 = false;
        }
        if (!z13) {
            list = null;
        }
        if (list != null) {
            o.f(level);
            bVar = new xe.b(list, level, null);
        }
        mutableSharedFlow = this.f35890b.D0;
        this.f35889a = 2;
        if (mutableSharedFlow.emit(bVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$onDistrictClicked$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.google.android.gms.common.api.Api;
import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$getPriceRange$2", f = "CategoriesRepositories.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_TV}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getPriceRange$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super GetListingsBody.FiltrationData.Range>, Object> {
    final /* synthetic */ List<Integer> $categoriesIds;
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getPriceRange$2(CategoriesRepositories categoriesRepositories, List<Integer> list, zz.a<? super CategoriesRepositories$getPriceRange$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
        this.$categoriesIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$getPriceRange$2(this.this$0, this.$categoriesIds, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object next;
        int i11;
        int i12;
        int i13;
        CategoryRuleSet.IntConfiguration price;
        float f12;
        float f13;
        CategoryRuleSet.IntConfiguration price2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i14 = this.label;
        if (i14 != 0) {
            if (i14 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CategoriesRepositories categoriesRepositories = this.this$0;
            List<Integer> list = this.$categoriesIds;
            this.label = 1;
            obj = categoriesRepositories.getMultipleCategoryRuleSet(list, this);
            if (obj == f11) {
                return f11;
            }
        }
        List list2 = (List) obj;
        Iterator it2 = list2.iterator();
        Object obj2 = null;
        int i15 = Integer.MIN_VALUE;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                CategoryRuleSet.IntConfiguration price3 = ((CategoryRuleSet.RuleSet) next).getPrice();
                if (price3 != null) {
                    i11 = (int) price3.getMinValue();
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    CategoryRuleSet.IntConfiguration price4 = ((CategoryRuleSet.RuleSet) next2).getPrice();
                    if (price4 != null) {
                        i12 = (int) price4.getMinValue();
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i11 > i12) {
                        next = next2;
                        i11 = i12;
                    }
                } while (it2.hasNext());
            }
        }
        CategoryRuleSet.RuleSet ruleSet = (CategoryRuleSet.RuleSet) next;
        if (ruleSet != null && (price2 = ruleSet.getPrice()) != null) {
            i15 = (int) price2.getMinValue();
        }
        int i16 = i15;
        Iterator it3 = list2.iterator();
        if (it3.hasNext()) {
            obj2 = it3.next();
            if (it3.hasNext()) {
                CategoryRuleSet.IntConfiguration price5 = ((CategoryRuleSet.RuleSet) obj2).getPrice();
                if (price5 != null) {
                    f12 = price5.getMaxValue();
                } else {
                    f12 = Float.MAX_VALUE;
                }
                do {
                    Object next3 = it3.next();
                    CategoryRuleSet.IntConfiguration price6 = ((CategoryRuleSet.RuleSet) next3).getPrice();
                    if (price6 != null) {
                        f13 = price6.getMaxValue();
                    } else {
                        f13 = Float.MAX_VALUE;
                    }
                    if (Float.compare(f12, f13) < 0) {
                        obj2 = next3;
                        f12 = f13;
                    }
                } while (it3.hasNext());
            }
        }
        CategoryRuleSet.RuleSet ruleSet2 = (CategoryRuleSet.RuleSet) obj2;
        if (ruleSet2 != null && (price = ruleSet2.getPrice()) != null) {
            i13 = (int) price.getMaxValue();
        } else {
            i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return new GetListingsBody.FiltrationData.Range(kotlin.coroutines.jvm.internal.a.d(i16), kotlin.coroutines.jvm.internal.a.d(i13));
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super GetListingsBody.FiltrationData.Range> aVar) {
        return ((CategoriesRepositories$getPriceRange$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

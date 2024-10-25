package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeTopSliderItem.kt */
/* loaded from: classes2.dex */
public final class HomeTopSliderItem$HomeTopSliderViewHolder$sliderRunnable$2 extends Lambda implements g00.a<Runnable> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HomeTopSliderItem.HomeTopSliderViewHolder f24244a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTopSliderItem$HomeTopSliderViewHolder$sliderRunnable$2(HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder) {
        super(0);
        this.f24244a = homeTopSliderViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HomeTopSliderItem.HomeTopSliderViewHolder this$0) {
        int i11;
        o.i(this$0, "this$0");
        ViewPager2 viewPager2 = this$0.l().S;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null) {
            i11 = adapter.getItemCount();
        } else {
            i11 = 0;
        }
        if (i11 < 2) {
            return;
        }
        if (i11 == viewPager2.getCurrentItem()) {
            viewPager2.setCurrentItem(0);
        } else {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    }

    @Override // g00.a
    /* renamed from: c */
    public final Runnable invoke() {
        final HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder = this.f24244a;
        return new Runnable() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.a
            @Override // java.lang.Runnable
            public final void run() {
                HomeTopSliderItem$HomeTopSliderViewHolder$sliderRunnable$2.e(HomeTopSliderItem.HomeTopSliderViewHolder.this);
            }
        };
    }
}

package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
        if (isNormalItem(items[i]) && items[i].quality > 0) {
            items[i].quality--;
          } else {
        increaseQualityIfPossible(items[i]);
        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          if (items[i].sellIn < 11) {
            increaseQualityIfPossible(items[i])
        };
          if (items[i].sellIn < 6) {
            increaseQualityIfPossible(items[i]);
          }
        }
      }
    }

    private boolean isNormalItem(Item item) {
        return !item.name.equals("Aged Brie")
            && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")
            && !item.name.equals("Sulfuras, Hand of Ragnaros");
      }

    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
      items[i].sellIn = items[i].sellIn - 1;
    }

    if (items[i].sellIn < 0) {
      if (!items[i].name.equals("Aged Brie")) {
        if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          if (items[i].quality > 0) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
              items[i].quality = items[i].quality - 1;
            }
          }
        } else {
          items[i].quality = items[i].quality - items[i].quality;
        }
      } else {
        if (items[i].quality < 50) {
          items[i].quality = items[i].quality + 1;
        }
      }
    }
  }

  private void increaseQualityIfPossible(Item item) {
    if (item.quality < 50) {
      item.quality++;
    }
  }
}
